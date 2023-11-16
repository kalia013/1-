# One-dimensional-number-puzzle

1단계 숫자퍼즐 문제의 중요한 점은 아래와 같다.

1. 1차원 배열에 랜덤으로 숫자를 넣을 수 있는가? - generatePuzzleArray
2. 두 숫자를 입력받을 때 ex: 5, 1의 형태로 받을 수 있는가? -playPuzzle
3. 유효하지 않은 숫자를 걸러낼 수 있는가? - isValidInput
4. 입력 받은 숫자 2개의 위치를 바꿀 수 있는가? - swapNumbers
5. 정답은 어떤 방식으로 확인할 것인가? - isPuzzleSolved

## PlayPuzzle()

### generatePuzzleArray

위 함수에서는 우선 랜덤으로 난수를 생성해서 배열을 넣어야한다. Random 함수를 이용해서 난수를 입력 받을 수 있다.

하지만 이제 1~8까지의 겹치지 않는 숫자를 배열에 받아야하기에 기존에 생성된 난수를 넣었던 배열과 새로 받은 난수를 비교해서

난수가 겹치지 않게 배열에 넣을 수 있다

### userinput.split

위 함수를 이용해서 기존의 Scanner 함수를 사용했을 때 하나씩 받을 수 있었던 것을 ex: 3, 5형태로 받을 수 있게 된다.

두 개를 한번에 받았을 때는 다시 분리를 해서 각각의 변수에 넣어줘야하기에 2개짜리 배열을 사용해 나눠준다.

### isValidInput

1차원 숫자퍼즐은 1~8까지의 숫자만 있다 그래서 우리는 입력받은 두 숫자가 둘 다 1~8까지의 숫자인지 확인을 해야한다.

그래서 입력 받은 숫자와 배열 안에 있는 숫자가 일치할 때마다 변수 check의 값을 하나씩 올리고 check의 값이 2가 됬을때

두 숫자 모두 유효한 숫자라고 판단하고 swap을 실행시킨다. 

유효한 숫자가 아니면 continue로 다시 입력 받게 한다.

### swapNumbers

두 숫자를 바꾸는 방법은 간단하다. 

우선 해당 숫자와 같은 배열의 숫자의 주소 값을 받고 흔히들 아는 방식인 temp 빈 변수를 하나 선언해준뒤

swap을 해주면 된다.

### isPuzzleSolved

정답을 확인하는 방법은 이미 정답 숫자의 순서로 이뤄진 배열을 하나 만들어서 비교를 시키고 순서가 같으면

게임이 끝난다.

## trouble shooting

1. 일단 아직 C에 익숙해서 처음에 객체지향성이 아닌 절차지향성으로 코드를 작성했다. 자바가 만들어진 이유, 자바의 장점인
   객체지향성에 맞춰서 코딩을 하는것에 좀 더 익숙해져야 할 것 같다.

2. 부끄럽지만 git과 github를 사용해본게 이번이 처음이다. 태그를 달고 git과 github를 연동시켜 봤는데 제대로 한건지 모르겠다.

