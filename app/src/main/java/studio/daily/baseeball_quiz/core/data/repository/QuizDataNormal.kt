package studio.daily.baseeball_quiz.core.data.repository

import studio.daily.baseeball_quiz.core.model.Quiz
import studio.daily.baseeball_quiz.feature.createquiz.model.Difficulty

val normalQuizList = listOf(
    Quiz(
        id = 21,
        difficulty = Difficulty.NORMAL,
        question = "한 경기에서 타자가 안타, 2루타, 3루타, 홈런을 모두 치는 것을 뭐라고 부를까?",
        options = listOf("사이클링 히트", "퍼펙트 히트", "볼넷", "백투백홈런"),
        answerIndex = 1,
        explanation = "야구에서 한 선수가 한 경기에서 1루타, 2루타, 3루타, 홈런을 모두 쳐 냈을 때를 일컫는 말을 사이클링 히트라고 합니다."
    ),
    Quiz(
        id = 22,
        difficulty = Difficulty.NORMAL,
        question = "투수가 9이닝 동안 한 명의 주자도 1루에 내보내지 않고 승리하면?",
        options = listOf("노히트노런", "퍼펙트게임", "완투", "세이브"),
        answerIndex = 2,
        explanation = "한 경기에서 안타는 물론, 볼넷, 몸에 맞는 공, 야수들의 실책으로 인한 출루를 포함해 어떤 이유든지 모든 타자를 단 한 번도 1루로 내보내지 않고 승리햇을 때를 퍼펙트게임 이라고 부릅니다."
    ),
    Quiz(
        id = 23,
        difficulty = Difficulty.NORMAL,
        question = "투수가 9이닝 동안 안타를 1개도 허용하지 않았을 때를 무엇이라고 하는가?",
        options = listOf("노히트노런", "퍼펙트게임", "완투", "세이브"),
        answerIndex = 1,
        explanation = "투수가 상대팀에게 안타나 실점을 단 1개도 허용하지 않고 경기를 끝내는 것을 노히트노런이라고 합니다."
    ),
    Quiz(
        id = 24,
        difficulty = Difficulty.NORMAL,
        question = "불펜은 어떤 역할을 하는 선수들의 공간일까?",
        options = listOf("포수", "대타", "교체 투수", "외야수"),
        answerIndex = 3,
        explanation = "불펜은 야구 경기 전 혹은 진행되는 중에 투입될 투수들이 몸풀기 겸 투구 연습을 할 수 있도록 마련된 장소를 말합니다."
    ),
    Quiz(
        id = 25,
        difficulty = Difficulty.NORMAL,
        question = "사이클링 히트는 다음 중 어떤 조합일까?",
        options = listOf("1루타, 2루타, 3루타, 홈런", "2루타,2루타,3루타,3루타", "안타,안타,안타,안타", "병살타, 삼중살, 뜬공, 볼넷"),
        answerIndex = 1,
        explanation = "한 경기에서 타자가 안타, 2루타, 3루타, 홈런을 모두 치는 것을 사이클링 히트라고 합니다."
    ),
    Quiz(
        id = 26,
        difficulty = Difficulty.NORMAL,
        question = "번트는 주로 어떤 목적으로 사용하는 플레이일까?",
        options = listOf("홈런을 노릴 때", "주자를 진루시키기 위해", "점수를 지키기 위해", "투수를 교체하기 위해"),
        answerIndex = 2,
        explanation = "주로 1루에 주자가 나가 있을 때, 2루까지 보내기 위해 번트를 시도합니다."
    ),
    Quiz(
        id = 27,
        difficulty = Difficulty.NORMAL,
        question = "타자의 타율을 계산하는 공식은?",
        options = listOf("안타/타석수", "안타/타수", "득점/타석수", "홈런/타수"),
        answerIndex = 2,
        explanation = "타율은 안타/타수로 계산합니다. 타수는 타자가 정규로 타격을 완료한 횟수를 말하는 것으로, 희생 번트, 희생 플라이, 볼넷(BB), 몸에 맞는 공(HBP), 타격 방해 및 주루 방해로 출루하는 것은 타수에 포함되지 않습니다."
    ),
    Quiz(
        id = 28,
        difficulty = Difficulty.NORMAL,
        question = "OPS는 어떤 두 기록을 합친 지표일까?",
        options = listOf("타율/홈런", "출루율/장타율", "타율/도루", "안타율/삼진율"),
        answerIndex = 2,
        explanation = "On-base Plus Slugging라 합니다. 출루율/장타율로 계산하며, 타자를 평가하는 스탯 중 하나입니다."
    ),
    Quiz(
        id = 29,
        difficulty = Difficulty.NORMAL,
        question = "주자가 타자의 공에 맞으면 어떤 판정일까?",
        options = listOf("스트라이크", "아웃", "볼 데드", "세이프"),
        answerIndex = 2,
        explanation = "타자가 친 공이 주자가 맞으면 주자는 아웃 처리됩니다."
    ),
    Quiz(
        id = 30,
        difficulty = Difficulty.NORMAL,
        question = "투수 교체는 한 이닝에 몇번까지 가능한가?",
        options = listOf("1번", "2번", "제한 없음", "3번"),
        answerIndex = 3,
        explanation = "투수 교체 횟수에 제한은 없습니다."
    ),
    Quiz(
        id = 31,
        difficulty = Difficulty.NORMAL,
        question = "더블 플레이란?",
        options = listOf("연속으로 홈런 두개", "한 플레이에 두명 아웃", "2루타 2 번", "투수 교체 2번"),
        answerIndex = 2,
        explanation = "연속으로 아웃 카운트가 두개 올라가는 것을 뜻합니다."
    ),
    Quiz(
        id = 32,
        difficulty = Difficulty.NORMAL,
        question = "타자가 친 공이 파울라인 안쪽으로 떨어지면?",
        options = listOf("파울", "홈런", "인플레이", "데드 볼"),
        answerIndex = 3,
        explanation = "투수가 던진 공이 타자의 배트에 맞아 파울이 되지 않고 페어 지역으로 날아가는 상황을 말합니다."
    ),
    Quiz(
        id = 33,
        difficulty = Difficulty.NORMAL,
        question = "K는 야구에서 어떤 의미일까?",
        options = listOf("스트라이크 아웃", "홈런", "도루", "볼넷"),
        answerIndex = 3,
        explanation = "일반적으로 삼진을 K라고 합니다."
    ),
    Quiz(
        id = 34,
        difficulty = Difficulty.NORMAL,
        question = "내야수가 아닌 포지션은?",
        options = listOf("유격수", "3루수", "포수", "우익수"),
        answerIndex = 4,
        explanation = "우익수는 외야수입니다."
    ),
    Quiz(
        id = 35,
        difficulty = Difficulty.NORMAL,
        question = "외야수가 아닌 포지션은?",
        options = listOf("좌익수", "중견수", "유격수", "우익수"),
        answerIndex = 3,
        explanation = "유격수는 내야수입니다."
    ),
    Quiz(
        id = 36,
        difficulty = Difficulty.NORMAL,
        question = "희생플라이는 언제 기록될까?",
        options = listOf("뜬공 아웃 후 주자가 홈에 들어올 때", "뜬공을 수비수가 놓쳤을 때", "주자의 도루 시도가 실패할 때", "수비수가 실책을 할 때"),
        answerIndex = 1,
        explanation = "타자가 외야 쪽으로 플라이를 때렸을 때 수비가 그 공을 잡아서 아웃시키고 난 후, 3루에 있던 주자가 홈으로 출발하여, 수비측의 주자 태그보다 먼저 홈에 들어와서 득점한 것을 가리킵니다."
    ),
    Quiz(
        id = 37,
        difficulty = Difficulty.NORMAL,
        question = "WAR은 무엇의 약자일까?",
        options = listOf("Win Above Replacement", "Wide Area Run", "World Average Record", "Walk And Run"),
        answerIndex = 1,
        explanation = "Wins Above Replacement(대체 수준 대비 승리 기여도)의 약어"
    ),
    Quiz(
        id = 38,
        difficulty = Difficulty.NORMAL,
        question = "풀카운트는 어떤 상황일까?",
        options = listOf("3-1", "3-2", "2-2", "1-3"),
        answerIndex = 2,
        explanation = "3볼 2스트라이크를 풀카운트라고 한다."
    ),
)