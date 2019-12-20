package main;

import java.util.Objects;

public class YesOrNo {
	private final char value;

	public YesOrNo(String value) {
		if (Objects.isNull(value)) {
			throw new IllegalArgumentException("값이 null이 될 수 없습니다.");
		}
		if (value.length() > 1) {
			throw new IllegalArgumentException("입력문자가 두 자 이상이 될 수 없습니다.");
		}
		this.value = value.toLowerCase().charAt(0);
		if (this.value != 'y' || this.value != 'n') {
			throw new IllegalArgumentException("입력문자는 y(Y)나 n(N)만 가능합니다.");
		}
	}

	public boolean isYes() {
		return value == 'y';
	}
}
