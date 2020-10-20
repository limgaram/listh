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
			System.out.println("���� �Է� : ");
			String s = sc.next();

			if (s.equals("add")) {
				Article a = new Article();

				a.id = no;

				ids.add(no);
				no++;

				System.out.println("�Խù� ������ �Է����ּ��� : ");
				String title = sc.next();
				a.title = title;
				titles.add(title);
				System.out.println("�Խù� ������ �Է����ּ��� : ");
				String body = sc.next();
				a.body = body;
				bodies.add(body);

				articles.add(a);
			}

			if (s.equals("list")) {
				for (int i = 0; i < ids.size(); i++) {
					System.out.println("��ȣ : " + ids.get(i));
					System.out.println("���� : " + titles.get(i));
					System.out.println("�Ŀ� : " + bodies.get(i));
					System.out.println("==============");
				}
			}
			if (s.equals("update")) {
				System.out.println("������ �Խù� ���� :");
				int targetId = sc.nextInt();

				for (int i = 0; i < ids.size(); i++) {
					int id = ids.get(i);

					if (id == targetId) {
						System.out.println("�Խù� ������ �Է����ּ��� : ");
						String newTitle = sc.next();
						System.out.println("�Խù� ������ �Է����ּ��� : ");
						String newBody = sc.next();

						titles.set(i, newTitle);
						bodies.set(i, newBody);
						break;
					}
				}
			}

			if (s.equals("delete")) {
				System.out.print(" �� �� �Խù��� ����ðڽ��ϱ�? : ");
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
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println(targetId + "�� �Խù��� �����Ǿ����ϴ�.");
				}

			}
		}

	}

}
