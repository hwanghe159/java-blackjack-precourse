2번째 시도
=======

다 구현하지 못한 채로 제출했기 때문에 요구사항을 더욱 지키면서 작성해보기.
------------------------------------------------------

- 딜러와 플레이어

- 게임 진행
  - main함수가 있는 Main클래스와 전체적인 게임 진행을 담당하는 BlackJackGame클래스 생성
  - main() (prepare(), gamePlay(), result())
    - prepare() : 플레이어가 입장하고, 이름과 베팅금액을 설정한다. 그리고 딜러와 플레이어에게 카드를 분배한다.
    - gamePlay() : 각 플레이어별로 게임을 진행한다. 마지막엔 딜러가 한장의 카드를 더 받았는지 여부도 출력한다.
    - result() : 딜러와 플레이어들의 카드패와 결과점수, 최종수익을 계산하여 출력한다.