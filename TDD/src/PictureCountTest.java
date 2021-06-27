import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PictureCountTest {

private Verlagshaus verlag;
	
	private String text = "Nam est rei prona nobis imo saepe venit autem. picture Affirmans inspectio subjectum to an ad. Virtutibus falsitatem corporibus quaerendum non est credidisse. Jam ubi iii longo nolle libet lapis illud. Incertas existimo ii ac innotuit mutuatur figmenta de. Pla lectorem vos inquiram eae multarum eos tractare. Ut credere de ea mirabar appello. Nos distinctae imaginandi cohaereant recensenda sap formaliter. Somni atqui visum at eidem ut dicam si et. \n"
			+ "\n"
			+ "Ex auditu at minuta angeli in si. Percepturi communibus indefinite quo hic eae dubitandum aliquandiu. Sum pati novi nunc tot uti meum. Ipsarum proprie impetus iis assumam probari age eos exiguum. Ex assideo haberet ea necesse enatare at quaeque nostras. Dat tria vis novo ille hoc. Rogo tale ob erat ut ac modo at. Hoc pendeant scriptis habentem rerumque sum. Deesse mea fusius pileos vul volens usu fuerim sentio dum. Ne gi to movere firmae tangam organa mearum. \n"
			+ "\n"
			+ "Sed remanetne sit abducerem est imaginans non dependent. Paulo his novas somno audio nia. Religio lor ordinis propria habemus cui. Cohaereant vis sim consistere ope concipitur imaginabor afferuntur. An im habet in reddi corpo debet solis nempe. Ac du viamque aequare at quandam habitum. Ita eam assentiar uti calescere somniemus perfectae distincta. De si facillimum necessario at permiscent praemissae. Situs si an minor novum ha pacto aures. Et suppono in diversa frigida. \n"
			+ "\n"
			+ "Qualem vacabo ignoro fallat dubito picture co fontem ex gi. Ha concludam infinitae explorant et ab apparebat an. Nec satyriscos expectabam institutum perfectius ita nos referuntur imaginarer seu. Bono mo nolo suam bile quin fato ii im. Dat fuistis mem hominem dicitur cum errandi vox exponam. Vetus uti sua ima situm semel cerae ope docti. Immensi sperare ineptum assidue dat tam chartam sopitum. Negare quibus quidem ac si solius ut fronte. \n"
			+ "\n"
			+ "Instituti desumptam id solvendae ad obversari. Nul falsum eae ego habeam opinio sit nullis inesse volent. Nolo in enim quia duas ex vice se to. Vigiliam repetere realiter hoc vul reliquis facultas vix sit recorder. Posset to sumpti re mendax. Ubi fal duo videbo vereor totius primae. Scientiis contingit somniorum ne in artificis objicient. Institutum co ex du frequenter substantia praevidere mortalibus ab. Clara si ab co sacra in erunt illud. Futurus ubi suo constet ejusdem spondeo vul testari. \n"
			+ "\n"
			+ "Nec archimedes manifestam picture deceperunt eae cohibendam praecipuum propugnent. Co solere im to maxime manebo maxima me. Videatur ob occurrat lectorem spectari in corporea ii augeatur. Spem ipse erit ex to illo ac unum soni. Dei ita vitae valde erant nec. Dimoveret sex occurrunt fit debiliora nul usurpabam ita corporeas distingui. Si perductae in existendi ex mo terminari. Unde ut ha quos ad at ista. Conflantur respondeam ens eos vix dissimilem. \n"
			+ "\n"
			+ "Bonus timeo ad si ex eadem mirum potui. Aeternum vim hoc res ens picture ignorata lectores putandum. Re quaesita totamque ea refutent secundum in. Nia dum pla credo illis cogor solem illam. Illi esto fato nudi idem mo tius re. Utramque credatur spectant si mo cavendum compages eo. In ii inter in putem fingi de. Attendam tractatu id vigiliam et ha et aliaeque. \n"
			+ "\n"
			+ "Vita male cau tam esse opus quos. Quodcumque frequenter ponderibus repugnemus ii agnoscerem in. Ad tius vero ad otii. Quidnam deesset sapores rei quaenam conatus cum rem ignosci. Rectum obstet habens eo necdum de qualem to id. Novi meum in quae quid du. Adesse realis fusius fingam an namque de et noluit. Nam scribi quinta posset verius ita sic plures. \n"
			+ "\n"
			+ "Nec res una proinde chartam requiri quaenam confuse. De ea se tamquam haberet exempli memores ipsarum ob. Earum se athei vi erunt. Si ad exhibent reperiri perpauca ab physicam invenero. Veluti unquam loquar easdem sua errare fas imo. Clara harum ipsis tamen ac ha longa co at mente. Ii si videretur ac contineri occurrere remanetne deleantur. Istam nomen in lucis ab donum volui quare. \n"
			+ "\n"
			+ "Pro distinctae falsitatis vul crediderim non contrariae collabitur picture cum. Hac nolle eae est vul otium unius deest. Hoc hae qui sitas culpa omnis. Non meae fere ego quod suas duas. Lor intelligo apparebat sed nec medicinam principia. Proficisci dem eae facillimum attendendo cogitantur jam operatione. \n"
			+ "\n"
			+ "";
	
	
	
	 @BeforeEach                                         
	    public void setUp() throws Exception {
	        verlag = new Verlagshaus();
	    }

	    @Test                                               
	    @DisplayName("Picture Count Test")   
	    public void testPictureCount() {
	        assertEquals(5,verlag.countPictures(this.text), "Calculation failed");
	    }
	    
	    @Test                                               
	    @DisplayName("Capital Case")   
	    public void testCapital() {
	        assertEquals(1,verlag.countPictures("Picture"), "Calculation failed");
	    }

		@Test                                               
	    @DisplayName("Null Testing")   
	    public void testNull() {
	        assertThrows(IllegalArgumentException.class, ()->verlag.textToEuro(null));
	    }
	    

}
