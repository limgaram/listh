package main;

import java.util.ArrayList;
import java.util.Scanner;

public class listh {

	public static void main(String[] args) {
		ArrayList<Integer> ids = new ArrayList<>();
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		ArrayList<Article> articles = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size = 0;

		int no = 1;

		while (true) {
			System.out.println("명렁어 입력 : ");
			String s = sc.next();

			if (s.equals("add")) {
				Article a = new Article();

				a.id = no;

				ids.add(no);
				no++;

				System.out.println("게시물 제목을 입력해주세요 : ");
				String title = sc.next();
				a.title = title;
				titles.add(title);
				System.out.println("게시물 내용을 입력해주세요 : ");
				String body = sc.next();
				a.body = body;
				bodies.add(body);

				articles.add(a);
			}

			if (s.equals("list")) {
				for (int i = 0; i < ids.size(); i++) {
					System.out.println("번호 : " + ids.get(i));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("냐용 : " + bodies.get(i));
					System.out.println("==============");
				}
			}
			if (s.equals("update")) {
				System.out.println("수정할 게시물 선택 :");
				int targetId = sc.nextInt();

				for (int i = 0; i < ids.size(); i++) {
					int id = ids.get(i);

					if (id == targetId) {
						System.out.println("게시물 제목을 입력해주세요 : ");
						String newTitle = sc.next();
						System.out.println("게시물 내용을 입력해주세요 : ");
						String newBody = sc.next();

						titles.set(i, newTitle);
						bodies.set(i, newBody);
						break;
					}
				}
			}

			if (s.equals("delete")) {
				System.out.print(" 몇 번 게시물을 지우시겠습니까? : ");
				int targetId = sc.nextInt();

				int existFlag = 2;

				for (int i = 0; i < ids.size(); i++) {
					int id = ids.get(i);
					if (id == targetId) {
						existFlag = 1;
						ids.remove(i);
						titles.remove(i);
						bodies.remove(i);
						break;
					}
				}
				if (existFlag == 2) {
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					System.out.println(targetId + "번 게시물이 삭제되었습니다.");
				}

			}
		}

	}

}
