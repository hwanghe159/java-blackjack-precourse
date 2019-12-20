기능구현 목록
=========

1. 준비단계 prepare()
- 플레이어의 이름을 입력받는다, 쉼표기준으로 분리한다
  - 플레이어가 8명이 초과되면 예외처리
  - 분리한 이름별로 플레이어의 배팅금액을 입력받는다
  - 이름과 배팅금액으로 플레이어를 생성하여 플레이어의 list에 추가한다
- 딜러와 플레이어에게 카드를 분배한다
  - 먼저 cardFactory를 섞는다
  - 딜러와 각 플레이어에게 2장씩 나눠준다
  - 나누어 주었다는 메시지를 출력한다
  - 딜러와 플레이어가 받는 카드를 출력한다
    - 딜러는 한 장만 출력한다
    - 각 플레이어는 두 장 모두 출력한다

2. 게임진행단계 gamePlay()
- 각 플레이어별로 게임을 진행한다
  - 한 장을 더 받을지 여부를 입력받는다
    - 한 장을 더 받으면 
      - 카드목록에 추가한다 
      - 카드목록을 출력한다
    - 안받으면 종료
       
3. 마무리 단계 result()
- 딜러가 한 장 더 받아야 하는지 판단하고 받아야 한다면 한 장 더 받는다
- 딜러와 모든 플레이어의 카드목록과 결과점수를 출력한다
- 결과로 최종 수익을 계산한다
- 딜러와 모든 플레이어의 최종수익을 출력한다...