package studio.daily.baseeball_quiz.core.data.repository

import studio.daily.baseeball_quiz.core.model.Quiz
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

var hardQuizList = listOf(
    Quiz(
        id = 39,
        difficulty = Difficulty.HARD,
        question = "MLB에서 ‘사이영상(Cy Young Award)’은 어떤 부문에서 주는 상일까?",
        options = listOf("타자", "신인", "투수", "감독"),
        answerIndex = 3,
        explanation = "MLB의 사이영상은 각 리그(AL, NL) 최고의 투수에게 주는 상으로, 전설적인 투수 ‘사이 영(Cy Young)’의 이름에서 유래했습니다."
    ),
    Quiz(
        id = 40,
        difficulty = Difficulty.HARD,
        question = "‘포심 패스트볼’은 어떤 구질일까?",
        options = listOf("손가락 두 개로 던지는 변화구", "손가락 네 개로 던지는 직구", "손가락 네 개로 던지는 커브", "느리게 던지는 체인지업"),
        answerIndex = 2,
        explanation = "포심 패스트볼은 공의 실밥을 네 손가락으로 잡아 던지는 가장 기본적인 직구로, 속도가 빠릅니다."
    ),
    Quiz(
        id = 41,
        difficulty = Difficulty.HARD,
        question = "보크 판정은 언제 내려질까?",
        options = listOf("투수가 타자에게 욕설할 때", "투수가 부정 투구를 할 때", "투수가 세트 포지션에서 부정한 동작을 할 때", "포수가 공을 놓쳤을 때"),
        answerIndex = 3,
        explanation = "보크는 투수가 주자를 속이는 부정한 움직임을 보였을 때 선언되며, 주자는 한 루씩 진루합니다."
    ),
    Quiz(
        id = 42,
        difficulty = Difficulty.HARD,
        question = "투수가 한 경기에서 27명의 타자를 연속으로 아웃시키는 것을 뭐라고 할까?",
        options = listOf("노히트노런", "퍼펙트게임", "완투", "세이브"),
        answerIndex = 2,
        explanation = "단 한 명의 타자도 출루시키지 않고 27타자를 연속으로 처리하는 경기를 퍼펙트게임이라 합니다. 노히트노런보다 더 완벽한 기록입니다."
    ),
    Quiz(
        id = 43,
        difficulty = Difficulty.HARD,
        question = "ERA는 무엇을 의미하는가?",
        options = listOf("이닝당 평균 실점", "9이닝당 평균 자책점", "경기당 평균 타점", "수비율"),
        answerIndex = 2,
        explanation = "ERA(Earned Run Average)는 투수가 9이닝 동안 허용하는 자책점의 평균을 나타내는 지표입니다. 낮을수록 좋은 성적을 의미합니다."
    ),
    Quiz(
        id = 44,
        difficulty = Difficulty.HARD,
        question = "사이드암 투수는 어떤 투수인가?",
        options = listOf("팔을 어깨 위로 던지는 투수", "팔을 옆으로 던지는 투수", "언더핸드 투수", "왼손 투수"),
        answerIndex = 2,
        explanation = "팔을 어깨 높이쯤에서 수평에 가깝게 던지는 투수를 사이드암이라 하며, 공의 각도와 움직임이 독특합니다."
    ),
    Quiz(
        id = 45,
        difficulty = Difficulty.HARD,
        question = "WAR이 의미하는 것은?",
        options = listOf("해당 선수의 팀 기여도", "평균 실책 수", "팀 승률", "투수의 피안타율"),
        answerIndex = 1,
        explanation = "WAR(Win Above Replacement)은 ‘대체 가능한 평균 선수보다 몇 승을 더 가져오는가’를 의미하는 통합 지표입니다."
    ),
    Quiz(
        id = 46,
        difficulty = Difficulty.HARD,
        question = "선발투수가 승리투수가 되려면 최소 몇 이닝을 던져야 할까?",
        options = listOf("3이닝", "4이닝", "5이닝", "6이닝"),
        answerIndex = 3,
        explanation = "규정상 선발투수는 5이닝 이상 던지고, 팀이 리드를 유지한 채 승리해야 승리투수가 됩니다."
    ),
    Quiz(
        id = 47,
        difficulty = Difficulty.HARD,
        question = "클린업 트리오란?",
        options = listOf("1~3번 타선", "3~5번 중심 타선", "6~8번 하위 타선", "9~2번 타선"),
        answerIndex = 2,
        explanation = "팀의 중심 타선으로, 장타력과 결정력이 높은 타자들이 배치됩니다. 득점 생산의 핵심 구간입니다."
    ),
    Quiz(
        id = 48,
        difficulty = Difficulty.HARD,
        question = "백도어 슬라이더란?",
        options = listOf("몸쪽으로 파고드는 변화구", "바깥쪽에서 스트라이크존 안으로 휘어 들어오는 변화구", "공이 위로 뜨는 변화구", "아래로 떨어지는 변화구"),
        answerIndex = 2,
        explanation = "우타자 기준 바깥쪽에 있다가 홈플레이트를 살짝 스치며 스트라이크로 들어오는 궤적을 그리는 슬라이더입니다."
    ),
    Quiz(
        id = 49,
        difficulty = Difficulty.HARD,
        question = "야구에서 세이브 상황의 조건이 아닌 것은?",
        options = listOf("팀이 3점 이하로 앞서 있을 때", "3점차 이하 리드에서 최소 1이닝 이상 던질 때", "동점 상황일 때", "5점차 리드 상황에서 3이닝을 던져 경기를 마무리 할 때"),
        answerIndex = 3,
        explanation = "세이브는 리드한 상황에서만 기록됩니다. 동점이면 세이브가 성립하지 않습니다."
    ),
    Quiz(
        id = 50,
        difficulty = Difficulty.HARD,
        question = "클러치 히터란?",
        options = listOf("초반에 홈런 치는 타자", "찬스 상황에서 강한 타자", "삼진이 적은 타자", "출루율이 높은 타자"),
        answerIndex = 2,
        explanation = "득점권 주자 상황(2루·3루)에 강한 타자를 의미하며, 경기 흐름을 바꾸는 결정적인 타격을 잘합니다."
    ),
)