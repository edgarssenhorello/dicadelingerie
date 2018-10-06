package br.edgarsalardani.com.dicadelingerie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Post> lstPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPost = new ArrayList<>();
        lstPost.add(new Post("Agenda\n"+"Gestacional", "Post","" +
                "Primeiro e mais importante passo\n\n" +
                "\nAntes de saber o que deve ser feito ao longo dos nove meses, a gestante deverá dar prioridade ao agendamento do pré-natal. Até porque algumas futuras mamães buscam referências de médicos, seja com amigas ou em “grupos de mães” das redes sociais.\n" +
                "\n" +
                "No entanto, de acordo com o SUS (Sistema Único de Saúde), o ideal é que a primeira consulta seja realizada antes mesmo da concepção. A vantagem disso é que a gestante ficará bem informada e preparada física e emocionalmente.\n" +
                "\n" +
                "Entenda que o pré-natal\n\n É a assistência médica para a gestante e para o bebê desde a concepção até o nascimento do bebê. Ele é feito por um médico obstetra e visa evitar possíveis problemas para mãe e para o filho.\n" +
                "\n" +
                "1º trimestre - 3 meses (1 a 14 semanas)\n" +
                "Esta é a fase mais delicada da gestação, pois é quando mais ocorre abortos espontâneos, geralmente na 14ª semana. É neste período também que a mulher deve começar a ingerir ácido fólico, embora a recomendação seja para antes da gravidez.\n" +
                "\n" +
                "Além disso, a mamãe deve se atentar em:\n" +
                "\n" +
                "- Verificar as carências do plano de saúde, se ele vai cobrir todo o pré-natal e o parto para já ir se programando;\n" +
                "-Para as mamães que farão pelo SUS, o agendamento do pré-natal deve ser feito o quanto antes;\n" +
                "-Se estiver trabalhando, a gestante deverá avisar os superiores para ajustar horários de consultas e se acaso for precisar faltar devido a desconfortos;\n" +
                "-Manter uma alimentação equilibrada e evitar alimentos crus, como sushi e sashimi;\n" +
                "-Quem fuma ou bebe deve abolir o cigarro e o álcool o quanto antes;\n" +
                "-Nem pensar em pegar peso;\n" +
                "-Dormir pelo menos 8 horas diárias;\n" +
                "-Ingerir bastante líquido;\n" +
                "-Não ingerir cafeína.”. ",R.drawable.agendagest));

        lstPost.add(new Post("Estrias na\n"+ "Gravidez","Post","" +
                "Estrias na gravidez: E aí, será que só o uso de um creme já basta?\n" +
                "\n" +
                "Grávidas são mais propensas a estrias por conta das alterações hormonais e da distensão do abdômen. A prevenção das estrias não precisa esperar o terceiro trimestre, quando a barriga já está bem grande, ela pode começar desde o início da gravidez. A partir do quarto mês, os cuidados devem ser redobrados, pois é quando o estiramento da pele é maior.\n" +
                "A forma mais importante de prevenir as estrias durante a gestação é o controle alimentar, para não ganhar peso em excesso. Lembre-se: a grávida não precisa \"comer por dois\". Isso é mito! Além do risco de estrias, gestante acima do peso também aumenta o risco de um parto prematuro, diabetes na gravidez, hipertensão na gravidez podendo levar à pré-eclampsia e eclampsia, distúrbio da tireoide e óbito do feto. O bebê também corre o risco de engordar e nascer obeso.\n"+
                "O ideal é que ao longo do dia sejam feitas de seis a sete refeições balanceadas e bem distribuídas. É importante, sim, que a gestante consuma proteína e carboidrato, são fontes de energia fundamentais para ela e para o feto, mas cuidado para não exagerar.\n" +
                        "\n" +
                        "Além disso, a escolha de um sutiã adequado desde a gravidez é muito importante para a anatomia das mamas. Segundo especialista, desde a gravidez a mulher precisa adaptar o sutiã ao novo tamanho e peso das mamas para evitar dor nos ombros, nos seios, além de ajudar a evitar as estrias.\n"+
                "\n\nDescobriu que está grávida e já quer começar a se cuidar para evitar estrias?\n\n O indicado para gestantes é o uso de óleo de amêndoas. Beber muito líquido também ajuda a evitar as estrias, além de ser importante para a saúde geral da gestante, e não apenas da pele.\n" +
                        "\n" +
                        "Sempre tenha o cuidado de usar produtos que sejam indicados pelo seu médico. Algumas substâncias em sua composição podem ser prejudiciais ao feto. Durante o pós-parto, existem alguns tipos de peeling contraindicados e alguns indicados que são aqueles que não utilizam ácidos. Procure orientação médica, e cuide-se! ♥",R.drawable.estrias));

        lstPost.add(new Post("Ácido fólico e os benefícios para a gravidez! ","Post","" +
                "A mulher que está tentando engravidar deve tomar ácido fólico?\n" +
                "É verdade! Mas será que o objetivo é aumentar a fertilidade e facilitar a mulher a engravidar como alguns boatos sugerem? Bom, até o presente, isso não está comprovado cientificamente.\n" +
                "\n" +
                "Qual é a real importância do ácido fólico? \n"+
                "Ele é super importante para a boa formação do seu bebê! Veja a quantidade de benefícios que ingeri-lo antes e durante a gravidez proporciona. São eles:\n" +
                "\n" +
                "A formação adequada da medula espinhal e do cérebro do bebê, ajuda a prevenir más-formações do feto e anemia gestacional, previne defeitos de fechamento do tubo neural como anencefalia e espinha bífida além de lábio leporino e fenda palatina, malformações cardíacas e do trato gênito-urinário, proporciona a redução no risco de ruptura da placenta, restrição do crescimento intrauterino e parto prematuro, prevenção de doenças respiratórias na infância e da síndrome de Down.\n"+
                "A Organização Mundial da Saúde (OMS) recomenda que as mulheres devem consumir de 0,4 mg a 0,8 mg de folato cerca de três meses antes de engravidar até a 12ª semana de gestação. Mas não há problema se você se descobriu grávida e não estava tomando. Nesse caso, comece a tomar assim que souber. No seu pré-natal, deverá ser uma das primeiras recomendações do seu médico.\n" +
                "\n" +
                "Quais são os benefícios de tomar ácido fólico antes de engravidar?\n"+
                "A suplementação de folato deve ser iniciada antes da concepção do bebê porque o tubo neural (estrutura precursora do cérebro e da medula espinhal) se fecha entre 22º e 28º dias após a concepção. O fechamento deste tubo é essencial para a formação da calota craniana e da coluna vertebral. As mulheres que tomam o ácido fólico depois do resultado do teste de gravidez correm o risco desta anomalia já estar em desenvolvimento, pois a época de aparecimento deste tipo de malformação ocorre cedo.\n" +
                "\n" +
                "A época do estabelecimento dos diversos tipos de malformações fetais é:\n" +
                "\n" +
                "– Defeitos do tubo neural – 28 dias;\n" +
                "\n" +
                "– Defeitos do septo ventricular cardíaco – 42 dias;\n" +
                "\n" +
                "– Lábio leporino – 36 dias;\n" +
                "\n" +
                "– Fenda palatina – 47 a 72 dias.\n" +
                "\n" +
                "Quais alimentos oferecem ácido fólico?\n" +
                "O ácido fólico é encontrado naturalmente em alimentos de folhas verde-escuras (daí o nome fólico) como: espinafre, couve de bruxelas, rúcula, soja e derivados. Além disso, você também o encontra no abacate, feijão branco, aspargos, laranja, melão, maça, brócolis, gema de ovo, fígado, peixes, gérmen de trigo, salsinha, beterraba crua e amendoim.\n"+
                "Essa quantidade indicada pela OMS nem sempre está garantida pela alimentação, pois pode estar presente em quantidades insuficientes para suprir as necessidades da mulher que deseja engravidar. O cozimento prolongado dos alimentos pode destruir até 90% do seu conteúdo em ácido fólico. Por isso, o complemento do ácido fólico deve ser recomendado para gestantes. E mesmo se tratando de uma recomendação mundial, o consumo deste suplemento é ainda insatisfatória, tanto no Brasil quanto em outros lugares do mundo.\n" +
                "\n" +
                "Fonte: Scielo.",R.drawable.beneficios));

        lstPost.add(new Post("Primeira gravidez? Saiba alguns cuidados importantes!","Post","" +
                "A primeira gestação é um marco na vida de uma mulher. É um universo novo, com muitos assuntos para explorar. De todos os cuidados, talvez o mais importante para se lembrar seja a atenção com a pressão arterial!\n" +
                "\n" +
                "Como vai a sua pressão arterial?\n" +
                "Você sabia que as mulheres mais sujeitas à pressão alta na gestação são as mulheres na primeira gravidez? As consequências dessa pressão alta podem ser realmente sérias. A hipertensão pode evoluir para o que é chamado de pré-eclampsia e, para a forma mais grave, a eclampsia. No Brasil, ela é responsável por 75% das mortes maternas, o que é um pena, pois essa patologia pode ser prevenida se for tratada precocemente. Já em países do primeiro mundo, é raro ocorrer uma morte por eclâmpsia.\n"+
                "O fato é que, além de fatores como:\n" +
                "\n" +
                "- mulheres grávidas com menos de 18 anos e acima dos 35 anos de idade,\n" +
                "\n" +
                "- mulheres já com sobrepeso quando engravidaram,\n" +
                "\n" +
                "- as que ganharam muito peso durante a gravidez,\n" +
                "\n" +
                "- ter parentes próximos que já passaram por pré-eclampsia,\n" +
                "\n" +
                "Há também fatores como o estresse que contribuem para a hipertensão. As mulheres que não dormem bem, que trabalham demais, sem apoio familiar, ou que possuem muitas preocupações e por isso vivem estressadas correm risco maior de desenvolver pré-eclâmpsia.\n"+
                "Por isso é importante sempre estar atenta a sua pressão arterial. E o alerta vai principalmente em caso de primeira gravidez. É importante que a grávida tenha uma rotina mais tranquila e que tenha apoio.\n" +
                "\n" +
                "O ganho de peso\n\n\n" +
                "Além disso, os cuidados devem começar logo no primeiro trimestre de gestação: é  importante é garantir uma boa nutrição. A gestante precisa ingerir proteínas e evitar massas, doces, frituras e comidas gordurosas.\n"+
                "O ideal é que ela engorde de 8kg a 12kg durante toda a gravidez, de forma que em um mês, quarenta dias depois do nascimento do bebê, volte ao peso que tinha antes de engravidar. O grande perigo do excesso de peso é a pré-eclampsia. Se a dieta não for balanceada e houver abuso na ingestão de sal, o risco aumenta.",R.drawable.primeiragravidez));

        lstPost.add(new Post("As mil vantagens dos sutiãs para amamentação","Post","" +
                "Quando a mulher está gerando um bebê, a mudança nos seios é identificada rapidamente.\n" +
                "\n" +
                "Isso porque eles ficam mais sensíveis e aumentam de tamanho, necessitando de uma proteção especial.\n" +
                "\n" +
                "Depois que o bebê nasce, os cuidados com os seios são redobrados, para garantir uma amamentação segura e tranquila.\n" +
                " \n" +
                "\n" +
                "Pensando nisso, preparamos um texto para você entender e tirar todas as suas dúvidas sobre sutiãs para amamentação. Acompanhe!\n" +
                "\n" +
                "Quais as vantagens dos sutiãs para amamentação?\n\n\n"+
                "Com abertura frontal, o sutiã para amamentação é fundamental para o período pós-parto. Ele é ajustável, o que garante a sustentação e conforto para os seios.\n" +
                "\n" +
                "O ajuste, a abertura e o fechamento da peça são fáceis de fazer, pois, no momento em que estiver com o bebê nos braços, você vai precisar dessa praticidade.\n" +
                "\n" +
                "Ele também tem uma boa sustentação, mesmo quando a abertura está sendo usada.\n" +
                "\n" +
                "Diferente dos sutiãs comuns para grávidas, os de amamentação têm as alças reforçadas, largura adequada para as costas, fibra resistente e fechos especiais.\n" +
                "\n" +
                "São ideais para dormir, evitando dores nos seios.\n" +
                "\n" +
                "E não pense que os únicos modelos disponíveis são aqueles na cor bege e sem graça.\n" +
                "\n" +
                "Pelo contrário, há diversas opções para todos os estilos e gostos.\n" +
                "\n" +
                "Dessa forma, você vai adquirir uma peça funcional e cheia de charme!\n"+
                "Qual tamanho devo comprar?\n" +
                "É natural que os seios aumentem depois do nascimento do bebê, mas não há como definir exatamente o quanto eles vão crescer.\n" +
                "\n" +
                "Neste caso, você pode comprar um sutiã com dois números acima do que você vestia antes de engravidar.\n"+
                "Entretanto, saiba que nos três primeiros meses a produção de leite aumenta, pois o seu corpo está regularizando a quantidade de acordo com as necessidades da criança.\n" +
                "\n" +
                "Após estes três primeiros meses, a numeração do sutiã acaba dimuindo um tamanho. Isso acontece porque a produção de leite já vai estar definida de acordo com a quantidade que o bebê consome.\n" +
                "\n" +
                "Depois dos seis meses, o seu filho vai começar a se alimentar, fazendo com o que o leite materno se torne um alimento complementar na dieta dele.\n" +
                "\n" +
                "Novamente, a produção de leite será regulada e a numeração do sutiã poderá diminuir um tamanho, podendo permanecer esta mesma medida até o fim da amamentação.\n" +
                "\n" +
                "Para as mulheres que amamentam até os 2 anos de idade da criança, conforme recomendado pelo Ministério da Saúde, o tamanho da lingerie vai depender da forma como o corpo se encontrar nesta fase.\n" +
                "\n" +
                "Com bojo ou sem bojo?\n"+
                "Essa é uma escolha pessoal, pois os sutiãs são desenhados para proporcionar conforto, com ou sem bojo.\n" +
                "\n" +
                "As mulheres que já estão habituadas a usar bojo costumam continuar com essa preferência, pois se agradam do visual estético desse formato.\n" +
                "\n" +
                "Além disso, há muitas opções disponíveis, com cores, estampas e texturas diferentes, para deixar a mulher ainda mais bonita. Os modelos com renda, por exemplo, são super femininos e charmosos!\n" +
                "\n" +
                "Quais são os modelos disponíveis?\n" +
                "Os sutiãs de amamentação se diferenciam dos demais devido a estrutura que é mais resistente.\n" +
                "\n" +
                "Eles possuem alças largas e abertura frontal para facilitar quando for dar de mamar ao bebê.\n"+
                "Entre os modelos clássicos de amamentação está o de costas nadadoras que oferece maior sustentação não só para o seios, como também para a parte de traz que fica mais sensível nesta fase.\n" +
                "\n" +
                "Ele também é ideal para combinações com roupas mais cavada, pois assim não fica com as alças aparecendo, como é comum no tradicional.\n" +
                "\n" +
                "Outras peças vão se diferenciar pela modernidade, com detalhes em renda, como é o caso dos croppeds que deixará um \"tchan\" a mais no seu look.\n" +
                "\n" +
                "E aí, deu para perceber o quanto os sutiãs para amamentação são úteis e necessários, não é mesmo?\n" +
                "\n" +
                "Uma das dicas mais importantes é investir em tamanhos diferentes, que acompanhem o crescimento dos seios.\n" +
                "\n" +
                "Tenha, também, modelos variados para ajudar na hora de combinar com as roupas.\n" +
                "\n" +
                "Aproveite todas as vantagens que esse tipo de sutiã possui e viva esse momento único e mágico ao lado do seu bebê.",R.drawable.sutiaamamentacao));

        lstPost.add(new Post("Veja 6 dicas:\n"+ "Dormir melhor\n"+"durante a gestação!","Post","" +
                "Gravidez dá um sono... Mas como dormir de forma confortável com o corpo cheio de alterações, não é mesmo? As posições que você estava acostumada antes da gravidez já não são tão boas assim, e quando mais a barriga cresce, mais o problema aumenta!\n" +
                "\n" +
                "Problemas para dormir nessa fase são comuns e podem ocorrer devido a fatores físicos ou emocionais que contribuem para o desconforto durante a noite.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Veja abaixo algumas dicas para ter um sono mais tranquilo na gestação:\n" +
                " \n" +
                "\n" +
                "1- Comece pelo básico:\n" +
                "Mantenha o quarto arejado e use lingeries, pijamas ou camisolas adequadas para o seu corpo em transformação, que possuam tecido macio e sem nada te apertando.\n"+
                "Você também já pode aproveitar para ter um pijama ou camisola que seja útil para o pós-parto e que venha com \"click\" ou abertura na parte dos seios para amamentação.\n\n"+
                "2- Ah, os enjoos!\n" +
                "No primeiro trimestre, quando a barriga ainda não está tão modificada, são os enjoos que podem atrapalhar. Eles podem surgir pela manhã, mas também podem aparecer à noite. Eles acontecem por causa do excesso de hormônios que deixa o transporte da comida pelo sistema digestivo mais lento. Cuide da sua alimentação: jante mais cedo, coma menos quantidade em intervalos mais curtos e faça uma refeição leve. Evite alimentos pesados como frituras.\n" +
                "\n" +
                " \n" +
                "\n" +
                "3- Beba bastante água e diminua o sal.\n"+
                "Isso ajuda a diminuir a retenção de líquido e consequentemente o inchaço na gravidez.\n" +
                "\n" +
                " \n" +
                "\n" +
                "4- Mas... e o xixi?\n" +
                "Mas e quando a barriga já está maior e as idas ao banheiro são o que também atrapalha o sono? A dica nesse caso é evitar líquidos duas horas antes de dormir, e quando for ao banheiro, tente eliminar o máximo de urina por vez.\n" +
                "\n" +
                " \n" +
                "\n" +
                "5- Dormir apoiada sobre o lado esquerdo é importante.\n" +
                "Principalmente ao fim da gravidez, é a posição mais indicada, diminuindo inclusive o risco de morte prematura do bebê.\n"+
                "\n" +
                "6- Fique tranquila.\n" +
                "Concentre-se em pensamentos relaxantes. Eu sei que mesmo com mais sono, a ansiedade e o medo do que está por vir podem atrapalhar. Uma boa dica para lidar com as ansiedades é se manter informada sobre o assunto, assim você pode se sentir mais segura, sabendo como se prevenir e como remediar as questões que envolvem a sua própria gestação.",R.drawable.dormir));



        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstPost);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);


    }
}