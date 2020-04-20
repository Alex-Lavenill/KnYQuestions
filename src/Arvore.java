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
					raiz.sim.nao.sim.setPergunta("Ela é serve à Kibustuji Muzan?");
					
						raiz.sim.nao.sim.sim = new Node();
						raiz.sim.nao.sim.sim.setPergunta("É um dos Doze Demônios da Lua?");

							raiz.sim.nao.sim.sim.sim = new Node();
							raiz.sim.nao.sim.sim.sim.setPergunta("É uma Lua Superior?");

								raiz.sim.nao.sim.sim.sim.sim = new Node();
								raiz.sim.nao.sim.sim.sim.sim.setPersonagem("Daki, Lua Superior Seis!");

								raiz.sim.nao.sim.sim.sim.nao = new Node();
								raiz.sim.nao.sim.sim.sim.nao.setPersonagem("Mukago, Lua Inferior Quatro!");

							raiz.sim.nao.sim.sim.nao = new Node();
							raiz.sim.nao.sim.sim.nao.setPersonagem("Demônio das Bolas de Temari!");

						raiz.sim.nao.sim.nao = new Node();
						raiz.sim.nao.sim.nao.setPergunta("Já devorou humanos?");
    
							raiz.sim.nao.sim.nao.nao = new Node();
							raiz.sim.nao.sim.nao.nao.setPersonagem("Tamayo!");
							
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
					raiz.nao.sim.sim.setPergunta("");


    }

    public void sim(){
		raiz = raiz.sim;
	}

	public void nao(){
    	raiz = raiz.nao;
	}

	public boolean possuiPersonagem(){
    	if (raiz.getPersonagem() == null){
    		return false;
		}
    	return true;
	}

	public void conteudo(){
    	if (raiz.personagem == null){
			System.out.println("\n### SEU PERSONAGEM... ###");
			System.out.println(raiz.pergunta);
		}
    	else {
			System.out.println("\n### VOCÊ PENSOU EM...###");
			System.out.println(raiz.personagem);
		}
	}

}
