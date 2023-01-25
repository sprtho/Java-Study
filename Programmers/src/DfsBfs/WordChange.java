package DfsBfs;

public class WordChange {
	
	static int answer = 0;
	static boolean[] visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordChange wordChange = new WordChange();
		
		String begin = "hit";
		
		String target = "cog";
		
		//String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		String[] words = {"hot", "dot", "dog", "lot", "log"};
		
		visited = new boolean[words.length];
		
		wordChange.dfs(begin, target, words, 0);
		
		System.out.println(answer);
		
	}
	
	public void dfs(String begin, String target, String[] words, int cnt) {
		
		if(begin.equals(target)) {
			answer = cnt;
			return;
		}
		
		for(int i = 0; i < words.length; i++) {
			
			if(visited[i] == true)
				continue;
			
			System.out.println("시작단어 : " + begin + " 변환단어 : " + words[i] + " cnt :" + cnt);
			
			int check = 0;
			for(int j = 0; j < begin.length(); j++) {
				if(begin.charAt(j) == words[i].charAt(j)) 
					check++;
			}
			
			if(begin.length() - 1 == check) {
				visited[i] = true;
				dfs(words[i], target, words, cnt+1);
				visited[i] = false;
			}
		}
		
	}

}
