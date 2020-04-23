public class Arvore {

    private Node raiz = new Node();

    public Arvore(){
		raiz.pergunta = "É mulher?";
		
			raiz.sim = new Node();
			raiz.sim.setPergunta("É ou já foi mãe? (biolóigica ou adotiva)");
			
				raiz.sim.sim = new Node();
				raiz.sim.sim.setPergunta("É uma demônio?");
				
					raiz.sim.sim.sim = new Node();
					raiz.sim.sim.sim.setPersonagem("Demônio Aranha Mãe!");
					
					raiz.sim.sim.nao = new Node();
					raiz.sim.sim.nao.setPersonagem("Kamado Kie!");
					
				raiz.sim.nao = new Node();
				raiz.sim.nao.setPergunta("É uma demônio?");
				
					raiz.sim.nao.sim = new Node();
					raiz.sim.nao.sim.setPergunta("Ela é serve à Kibutsuji Muzan?");
					
						raiz.sim.nao.sim.sim = new Node();
						raiz.sim.nao.sim.sim.setPergunta("É um dos Doze Demônios da Lua?");

							raiz.sim.nao.sim.sim.sim = new Node();
							raiz.sim.nao.sim.sim.sim.setPergunta("É uma Lua Superior?");

								raiz.sim.nao.sim.sim.sim.sim = new Node();
								raiz.sim.nao.sim.sim.sim.sim.setPersonagem("Daki, Lua Superior Seis!");

								raiz.sim.nao.sim.sim.sim.nao = new Node();
								raiz.sim.nao.sim.sim.sim.nao.setPersonagem("Mukago, Lua Inferior Quatro!");

							raiz.sim.nao.sim.sim.nao = new Node();
							raiz.sim.nao.sim.sim.nao.setPergunta("Assombra o monte Natagumo?");

								raiz.sim.nao.sim.sim.nao.sim = new Node();
								raiz.sim.nao.sim.sim.nao.sim.setPergunta("Controla marionetes?");

									raiz.sim.nao.sim.sim.nao.sim.sim = new Node();
									raiz.sim.nao.sim.sim.nao.sim.sim.setPersonagem("Um dos Demônios Aranha, a Mãe do Rui!");

									raiz.sim.nao.sim.sim.nao.sim.nao = new Node();
									raiz.sim.nao.sim.sim.nao.sim.nao.setPersonagem("Um dos Demônios Aranha, a Irmã do Rui!");

								raiz.sim.nao.sim.sim.nao.nao = new Node();
								raiz.sim.nao.sim.sim.nao.nao.setPersonagem("Susumaru, Demônio da Bola de Temari!");

						raiz.sim.nao.sim.nao = new Node();
						raiz.sim.nao.sim.nao.setPergunta("Já devorou humanos?");
    
							raiz.sim.nao.sim.nao.sim = new Node();
							raiz.sim.nao.sim.nao.sim.setPersonagem("Tamayo!");
							
							raiz.sim.nao.sim.nao.nao = new Node();
							raiz.sim.nao.sim.nao.nao.setPersonagem("Kamado Nezuko!");

					raiz.sim.nao.nao = new Node();
					raiz.sim.nao.nao.setPergunta("Faz parte do Esquadrão de Exterminadores?");

						raiz.sim.nao.nao.sim = new Node();
						raiz.sim.nao.nao.sim.setPergunta("É uma Pilar?");

							raiz.sim.nao.nao.sim.sim = new Node();
							raiz.sim.nao.nao.sim.sim.setPergunta("Possui uma aprendiz?");

								raiz.sim.nao.nao.sim.sim.sim = new Node();
								raiz.sim.nao.nao.sim.sim.sim.setPersonagem("Kocho Shinobu!");

								raiz.sim.nao.nao.sim.sim.nao = new Node();
								raiz.sim.nao.nao.sim.sim.nao.setPersonagem("Kanroji Mitsuri!");

							raiz.sim.nao.nao.sim.nao = new Node();
							raiz.sim.nao.nao.sim.nao.setPergunta("Trabalha na Mansão Borboleta?");

								raiz.sim.nao.nao.sim.nao.sim = new Node();
								raiz.sim.nao.nao.sim.nao.sim.setPersonagem("É aprendiz de Kochou Shinobu, Pilar dos Insetos?");

									raiz.sim.nao.nao.sim.nao.sim.sim = new Node();
									raiz.sim.nao.nao.sim.nao.sim.sim.setPersonagem("Tsuyuri Kanao!");

									raiz.sim.nao.nao.sim.nao.sim.nao = new Node();
									raiz.sim.nao.nao.sim.nao.sim.nao.setPergunta("Possui olhos azuis?");

										raiz.sim.nao.nao.sim.nao.sim.nao.sim = new Node();
										raiz.sim.nao.nao.sim.nao.sim.nao.sim.setPersonagem("Aoi Kanzaki!");

										raiz.sim.nao.nao.sim.nao.sim.nao.nao = new Node();
										raiz.sim.nao.nao.sim.nao.sim.nao.nao.setPersonagem("Uma das três assistentes da Mansão Borboleta: Nakahara Sumi, Terauchi Kiyo ou Takada Naho!\nDesculpe, elas são quase a mesma pessoa...");

								raiz.sim.nao.nao.sim.nao.nao = new Node();
								raiz.sim.nao.nao.sim.nao.nao.setPersonagem("Uma das filhas do Mestre Ubuyashiki Kagaya: Ubuyashiki Hinaki, Ubuyashiki Nichika, Ubuyashiki Kiriya ou Ubuyashiki Kanata!\nDesculpe, elas são quase a mesma pessoa...");

			raiz.nao = new Node();
			raiz.nao.setPergunta("É um demônio?");

				raiz.nao.sim = new Node();
				raiz.nao.sim.setPergunta("É um dos Doze Demônios da Lua?");

					raiz.nao.sim.sim = new Node();
					raiz.nao.sim.sim.setPergunta("É um Lua Superior?");

						raiz.nao.sim.sim.sim = new Node();
						raiz.nao.sim.sim.sim.setPergunta("Atacou a Vila dos Ferreiros?");

							raiz.nao.sim.sim.sim.sim = new Node();
							raiz.nao.sim.sim.sim.sim.setPergunta("Lutou contra Tokito Muichiro?");

								raiz.nao.sim.sim.sim.sim.sim = new Node();
								raiz.nao.sim.sim.sim.sim.sim.setPersonagem("Gyokko, Lua Superior Cinco!");

								raiz.nao.sim.sim.sim.sim.nao = new Node();
								raiz.nao.sim.sim.sim.sim.nao.setPersonagem("Hantengu, Lua Superior Quatro!");

							raiz.nao.sim.sim.sim.nao = new Node();
							raiz.nao.sim.sim.sim.nao.setPergunta("É um substituto de um Lua Superior que morreu?");

								raiz.nao.sim.sim.sim.nao.sim = new Node();
								raiz.nao.sim.sim.sim.nao.sim.setPergunta("Utiliza um instrumento musical?");

									raiz.nao.sim.sim.sim.nao.sim.sim = new Node();
									raiz.nao.sim.sim.sim.nao.sim.sim.setPersonagem("Nakime, Lua Superior Quatro!");

									raiz.nao.sim.sim.sim.nao.sim.nao = new Node();
									raiz.nao.sim.sim.sim.nao.sim.nao.setPersonagem("Kaigaku, Lua Superior Seis!");

								raiz.nao.sim.sim.sim.nao.sim = new Node();
								raiz.nao.sim.sim.sim.nao.sim.setPergunta("Lutou contra Kamado Tanjirou?");

									raiz.nao.sim.sim.sim.nao.sim.sim = new Node();
									raiz.nao.sim.sim.sim.nao.sim.sim.setPergunta("Kamado Nezuko ajudou a derrotá-lo(a)?");

										raiz.nao.sim.sim.sim.nao.sim.sim.sim = new Node();
										raiz.nao.sim.sim.sim.nao.sim.sim.sim.setPersonagem("Dai e Gyutaro, Luas Superiores Seis!");

										raiz.nao.sim.sim.sim.nao.sim.sim.nao = new Node();
										raiz.nao.sim.sim.sim.nao.sim.sim.nao.setPersonagem("Akaza, Lua Superior Três!");

									raiz.nao.sim.sim.sim.nao.sim.nao = new Node();
									raiz.nao.sim.sim.sim.nao.sim.nao.setPergunta("É um demônio capaz de utilizar uma Respiração?");

										raiz.nao.sim.sim.sim.nao.sim.nao.sim = new Node();
										raiz.nao.sim.sim.sim.nao.sim.nao.sim.setPersonagem("Kokushibou, Lua Superior Um!");

										raiz.nao.sim.sim.sim.nao.sim.nao.nao = new Node();
										raiz.nao.sim.sim.sim.nao.sim.nao.nao.setPersonagem("Douma, Lua Superior Dois!");
						// sim Oni; sim Jyuuni Kizuki; não Lua Superior
						raiz.nao.sim.sim.nao = new Node();
						raiz.nao.sim.sim.nao.setPergunta("Morreu para Kibutsji Muzan?");

							raiz.nao.sim.sim.nao.sim = new Node();
							raiz.nao.sim.sim.nao.sim.setPergunta("Tentou fugir?");

								raiz.nao.sim.sim.nao.sim.sim = new Node();
								raiz.nao.sim.sim.nao.sim.sim.setPersonagem("Wakuraba, Lua Infeior Três!");

								raiz.nao.sim.sim.nao.sim.nao = new Node();
								raiz.nao.sim.sim.nao.sim.nao.setPergunta("Tentou exigir mais sangue de Kibutsji Muzan?");

									raiz.nao.sim.sim.nao.sim.nao.sim = new Node();
									raiz.nao.sim.sim.nao.sim.nao.sim.setPersonagem("Rokuto, Lua Inferior Dois!");

									raiz.nao.sim.sim.nao.sim.nao.nao = new Node();
									raiz.nao.sim.sim.nao.sim.nao.nao.setPersonagem("Kamanue, Lua Inferior Seis!");

							raiz.nao.sim.sim.nao.nao = new Node();
							raiz.nao.sim.sim.nao.nao.setPergunta("Estava presente na última reúnião dos Luas Inferiores?");

								raiz.nao.sim.sim.nao.nao.sim = new Node();
								raiz.nao.sim.sim.nao.nao.sim.setPersonagem("Enmu, Lua Inferior Um!");

								raiz.nao.sim.sim.nao.nao.nao = new Node();
								raiz.nao.sim.sim.nao.nao.nao.setPersonagem("Rui, Lua Inferior Cinco!");

					raiz.nao.sim.nao = new Node();
					raiz.nao.sim.nao.setPergunta("Estava presente em Tokyo?");

						raiz.nao.sim.nao.sim = new Node();
						raiz.nao.sim.nao.sim.setPergunta("Foi mandado para atacar o Exterminador de Demônios com brincos de cartas de Hanafuda?");

							raiz.nao.sim.nao.sim.sim = new Node();
							raiz.nao.sim.nao.sim.sim.setPersonagem("Yahara, Demônio das Setas!");

							raiz.nao.sim.nao.sim.nao = new Node();
							raiz.nao.sim.nao.sim.nao.setPergunta("Ajudou Kamado Tanjirou?");

								raiz.nao.sim.nao.sim.nao.sim = new Node();
								raiz.nao.sim.nao.sim.nao.sim.setPersonagem("Yushiro, assistente da Tamayo!");

								raiz.nao.sim.nao.sim.nao.nao = new Node();
								raiz.nao.sim.nao.sim.nao.nao.setPersonagem("Kibutsji Muzan! O criador dos demônios!");

						raiz.nao.sim.nao.nao = new Node();
						raiz.nao.sim.nao.nao.setPergunta("Tentou atacar uma Marechi (sangue raro)?");

							raiz.nao.sim.nao.nao.sim = new Node();
							raiz.nao.sim.nao.nao.sim.setPergunta("Foi ferido durante um desintendimento?");

								raiz.nao.sim.nao.nao.sim.sim = new Node();
								raiz.nao.sim.nao.nao.sim.sim.setPersonagem("Kyogai, Demônio dos Tambores de Tsuzumi!");

								raiz.nao.sim.nao.nao.sim.nao = new Node();
								raiz.nao.sim.nao.nao.sim.nao.setPergunta("Foi derrotado por Agatsuma Zenitsu?");

									raiz.nao.sim.nao.nao.sim.nao.sim = new Node();
									raiz.nao.sim.nao.nao.sim.nao.sim.setPersonagem("Demônio da Língua da mansão Tsuzumi!");

									raiz.nao.sim.nao.nao.sim.nao.nao = new Node();
									raiz.nao.sim.nao.nao.sim.nao.nao.setPersonagem("Demônio com Um Chifre da mansão Tsuzumi!");

							raiz.nao.sim.nao.nao.nao = new Node();
							raiz.nao.sim.nao.nao.nao.setPergunta("Assombrou o monte Natagumo?");

								raiz.nao.sim.nao.nao.nao.sim = new Node();
								raiz.nao.sim.nao.nao.nao.sim.setPergunta("Seu corpo podia quebrar as espadas Nichirin?");

									raiz.nao.sim.nao.nao.nao.sim.sim = new Node();
									raiz.nao.sim.nao.nao.nao.sim.sim.setPersonagem("Um dos Demônios Aranha, o Pai do Rui!");

									raiz.nao.sim.nao.nao.nao.sim.nao = new Node();
									raiz.nao.sim.nao.nao.nao.sim.nao.setPersonagem("Um dos Demônios Aranha, o Irmão do Rui!");

								raiz.nao.sim.nao.nao.nao.nao = new Node();
								raiz.nao.sim.nao.nao.nao.nao.setPergunta("Foi morto por Kamado Tanjirou?");

									raiz.nao.sim.nao.nao.nao.nao.sim = new Node();
									raiz.nao.sim.nao.nao.nao.nao.sim.setPergunta("Conseguia se dividir?");

										raiz.nao.sim.nao.nao.nao.nao.sim.sim = new Node();
										raiz.nao.sim.nao.nao.nao.nao.sim.sim.setPersonagem("Demônio do Pantâno!");

										raiz.nao.sim.nao.nao.nao.nao.sim.nao = new Node();
										raiz.nao.sim.nao.nao.nao.nao.sim.nao.setPersonagem("Demônio das Mãos!");

				raiz.nao.nao = new Node();
				raiz.nao.nao.setPergunta("É ou já foi um Pilar?");

					raiz.nao.nao.sim = new Node();
					raiz.nao.nao.sim.setPergunta("Se aposentou?");

						raiz.nao.nao.sim.sim = new Node();
						raiz.nao.nao.sim.sim.setPergunta("Treinou mais de dois pupilos?");

							raiz.nao.nao.sim.sim.sim = new Node();
							raiz.nao.nao.sim.sim.sim.setPersonagem("Sakonji Urokodaki, ex-Pilar da Água!");

							raiz.nao.nao.sim.sim.sim = new Node();
							raiz.nao.nao.sim.sim.sim.setPersonagem("Kuwajima Jigoro, ex-Pilar do Trovão!");

						raiz.nao.nao.sim.nao = new Node();
						raiz.nao.nao.sim.nao.setPergunta("Participou da missão ao monte Natagumo?");

							raiz.nao.nao.sim.nao.sim = new Node();
							raiz.nao.nao.sim.nao.sim.setPersonagem("Tomioka Gyu, Pilar da Água!");

							raiz.nao.nao.sim.nao.nao = new Node();
							raiz.nao.nao.sim.nao.nao.setPergunta("Enfrentou Akaza, Lua Superior Três?");

								raiz.nao.nao.sim.nao.nao.sim = new Node();
								raiz.nao.nao.sim.nao.nao.sim.setPersonagem("Kyojuro Rengoku, Pilar das Chamas!");

								raiz.nao.nao.sim.nao.nao.nao = new Node();
								raiz.nao.nao.sim.nao.nao.nao.setPergunta("Possui esposa(s) conhecida(s)?");

									raiz.nao.nao.sim.nao.nao.nao.sim = new Node();
									raiz.nao.nao.sim.nao.nao.nao.sim.setPersonagem("Tengen Uzui, Pilar do Som!");

									raiz.nao.nao.sim.nao.nao.nao.nao = new Node();
									raiz.nao.nao.sim.nao.nao.nao.nao.setPergunta("Já maltratou Kamado Nezuko?");

										raiz.nao.nao.sim.nao.nao.nao.nao.sim = new Node();
										raiz.nao.nao.sim.nao.nao.nao.nao.sim.setPersonagem("Shinazugawa Sanemi, Pilar do Vento!");

										raiz.nao.nao.sim.nao.nao.nao.nao.nao = new Node();
										raiz.nao.nao.sim.nao.nao.nao.nao.nao.setPergunta("É religioso?");

											raiz.nao.nao.sim.nao.nao.nao.nao.nao.sim = new Node();
											raiz.nao.nao.sim.nao.nao.nao.nao.nao.sim.setPersonagem("Gyomei Himejima, Pilar da Terra");

											raiz.nao.nao.sim.nao.nao.nao.nao.nao.nao = new Node();
											raiz.nao.nao.sim.nao.nao.nao.nao.nao.nao.setPersonagem("Obanai Iguro, Pilar da Terra");

					raiz.nao.nao.nao = new Node();
					raiz.nao.nao.nao.setPergunta("É pai?");

						raiz.nao.nao.nao.sim = new Node();
						raiz.nao.nao.nao.sim.setPergunta("Utiliza uma das Respirações?");

							raiz.nao.nao.nao.sim.sim = new Node();
							raiz.nao.nao.nao.sim.sim.setPersonagem("Kamado Tanjuro, pai do Tanjiro!");

							raiz.nao.nao.nao.sim.nao = new Node();
							raiz.nao.nao.nao.sim.nao.setPersonagem("Ubuyashiki Kagaya!");

						raiz.nao.nao.nao.nao = new Node();
						raiz.nao.nao.nao.nao.setPergunta("Estava no fim da Seleção Final do Esquadrão de Exterminadores?");

							raiz.nao.nao.nao.nao.sim = new Node();
							raiz.nao.nao.nao.nao.sim.setPergunta("Recebeu um corvo ao fim sa Seleção?");

								raiz.nao.nao.nao.nao.sim.sim = new Node();
								raiz.nao.nao.nao.nao.sim.sim.setPergunta("Vestia um kimono azulado?");

									raiz.nao.nao.nao.nao.sim.sim.sim = new Node();
									raiz.nao.nao.nao.nao.sim.sim.sim.setPersonagem("Kamado Tanjiro!");

									raiz.nao.nao.nao.nao.sim.sim.nao = new Node();
									raiz.nao.nao.nao.nao.sim.sim.nao.setPersonagem("Shinazugawa Genya!");

								raiz.nao.nao.nao.nao.sim.nao = new Node();
								raiz.nao.nao.nao.nao.sim.nao.setPersonagem("Agatsuma Zenitsu!");

							raiz.nao.nao.nao.nao.nao = new Node();
							raiz.nao.nao.nao.nao.nao.setPergunta("Veste uma cabeça de javali como máscara e tem a melhor risada do anime?");

								raiz.nao.nao.nao.nao.nao.sim = new Node();
								raiz.nao.nao.nao.nao.nao.sim.setPersonagem("HASHIBIRA INOSUKE!!!");

								raiz.nao.nao.nao.nao.nao.nao = new Node();
								raiz.nao.nao.nao.nao.nao.nao.setPersonagem("Murata-san!");
    
    }

    public void sim(){
		raiz = raiz.sim;
	}

	public void nao(){
    	raiz = raiz.nao;
	}

	public String getPergunta(){
    	return raiz.getPergunta();
	}

	public String getPersonagem(){
    	return raiz.getPersonagem();
	}

	public int conteudo(){
    	if (raiz.personagem == null)
			return 0;
    	else
			return 1;
	}

}