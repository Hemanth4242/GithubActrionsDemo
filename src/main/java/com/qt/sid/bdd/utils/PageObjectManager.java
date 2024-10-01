package com.qt.sid.bdd.utils;

import com.qt.sid.bdd.pages.*;
import org.openqa.selenium.WebDriver;


public class PageObjectManager {

    private WebDriver driver;

    private HomePage homePage;

    private LoginPage loginPage;

    private LandingPage landingPage;

    private RecommendationPage recommendationPage;

    private SkillCoursesPage skillCoursesPage;

    private JobExchangePage jobExchangePage;

    private SkillCentrepage skillCentrepage;
    private SkillIndiaMapPage skillIndiaMapPage;

    private AboutUSPage aboutUSPage;
    private TermAndConditionsPage termAndConditionsPage;
    private PrivacyPolicyPage privacyPolicyPage;
    private DisclaimerPage disclaimerPage;
    private ContactUSPage contactUSPage;

    private SchemesPage schemesPage;

    private EBooksPage eBooksPage;

    private Sectorspage sectorspage;
    
    private MyDashboard myDashboard;
    
    private ProfilePage profilePage;
    
    private SurveysPollPage surveysPollPage;
    
    private FavouritePage favouritePage;
    
    private SettingsPage settingsPage;

    private  LookupResultPage lookupResultPage;

    private CareerCounselingPage careerCounselingPage;


    private PMKVYDashboardPage pMKVYDashboardPage;

   MyDashboardPage myDashboardPage;

    private SchemeDetailsPage schemeDetailsPage;

    private DashboardPage dashboardPage;

    private CoursesPage coursesPage;
    private OpportunitiesPage opportunitiesPage;
    private TrainingCentrePage trainingCentrePage;

    private CourseDetailPage courseDetailPage;
    
    private CourseCreatePage courseCreatePage;
    
    private JobDetailsPage jobDetailsPage;
    
    private ContentListPage contentListPage;
    
    private SkillUniversitiesPage skillUniversitiesPage;

    private ProfileDetailsPage profileDetailsPage;

    private TrainerPage trainerPage;

    private TrainingPartnerPage trainingPartnerPage;

    private AwardingBodyPage awardingBodyPage;

    private AssessmentAgencyPage assessmentAgencyPage;

    private AssessorPage assessorPage;

    private ITIStatePage itiStatePage;

    public  NSDCAdminPage nsdcAdminPage;

    private PractisePage practisePage;

    private TrainingPage trainingPage;


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
        BasePage.basePageDriver(driver);
    }

    public PractisePage getPractisePage() {

        return (practisePage == null) ? practisePage = new PractisePage(driver) : practisePage;

    }

    public TrainingPage getTrainingPage() {

        return (trainingPage == null) ? trainingPage = new TrainingPage(driver) : trainingPage;

    }
    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }

    public LoginPage getLoginPage() {

        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

    }

    public LandingPage getlandingPage() {

        return (landingPage == null) ? landingPage = new LandingPage(driver) : landingPage;

    }

    public TrainerPage getTrainerPage() {

        return (trainerPage == null) ? trainerPage = new TrainerPage(driver) : trainerPage;

    }

    public TrainingPartnerPage getTrainingPartnerPage() {

        return (trainingPartnerPage == null) ? trainingPartnerPage = new TrainingPartnerPage(driver) : trainingPartnerPage;

    }

    public RecommendationPage getRecommendationPage() {

        return (recommendationPage == null) ? recommendationPage = new RecommendationPage(driver) : recommendationPage;

    }

    public SkillCoursesPage getSkillCoursesPage() {

        return (skillCoursesPage == null) ? skillCoursesPage = new SkillCoursesPage(driver) : skillCoursesPage;

    }

    public JobExchangePage getJobExchangePage() {

        return (jobExchangePage == null) ? jobExchangePage = new JobExchangePage(driver) : jobExchangePage;

    }

    public SkillCentrepage getSkillCentrepage() {

        return (skillCentrepage == null) ? skillCentrepage = new SkillCentrepage(driver) : skillCentrepage;

    }

    public SkillIndiaMapPage getSkillIndiaMapPage() {

        return (skillIndiaMapPage == null) ? skillIndiaMapPage = new SkillIndiaMapPage(driver) : skillIndiaMapPage;

    }

    public AboutUSPage getAboutUSPage() {

        return (aboutUSPage == null) ? aboutUSPage = new AboutUSPage(driver) : aboutUSPage;

    }

    public TermAndConditionsPage getTermAndConditionsPage() {

        return (termAndConditionsPage == null) ? termAndConditionsPage = new TermAndConditionsPage(driver) : termAndConditionsPage;

    }

    public PrivacyPolicyPage getPrivacyPolicyPage() {

        return (privacyPolicyPage == null) ? privacyPolicyPage = new PrivacyPolicyPage(driver) : privacyPolicyPage;

    }

    public DisclaimerPage getDisclaimerPage() {

        return (disclaimerPage == null) ? disclaimerPage = new DisclaimerPage(driver) : disclaimerPage;

    }

    public ContactUSPage getContactUSPage() {

        return (contactUSPage == null) ? contactUSPage = new ContactUSPage(driver) : contactUSPage;

    }

    public SchemesPage getSchemesPage() {

        return (schemesPage == null) ? schemesPage = new SchemesPage(driver) : schemesPage;

    }

    public EBooksPage getEBookspage() {

        return (eBooksPage == null) ? eBooksPage = new EBooksPage(driver) : eBooksPage;

    }

    public Sectorspage getSectorspage() {

        return (sectorspage == null) ? sectorspage = new Sectorspage(driver) : sectorspage;

    }
    
    public MyDashboard getmyDashboard() {

        return (myDashboard == null) ? myDashboard = new MyDashboard(driver) : myDashboard;

    }
    
    public ProfilePage getprofilePage() {

        return ( profilePage == null) ? profilePage = new ProfilePage(driver) : profilePage;

    }



    public NSDCAdminPage getNSDCAdminPage() {

        return ( nsdcAdminPage == null) ? nsdcAdminPage = new NSDCAdminPage(driver) : nsdcAdminPage;

    }
    public SurveysPollPage getsurveysPollPage() {

        return ( surveysPollPage == null) ? surveysPollPage = new SurveysPollPage(driver) : surveysPollPage;

    }
    
    public FavouritePage getfavouritePage() {

        return ( favouritePage == null) ? favouritePage = new FavouritePage(driver) : favouritePage;

    }
    
    public SettingsPage getsettingsPage() {

        return ( settingsPage == null) ? settingsPage = new SettingsPage(driver) : settingsPage;

    }


    public LookupResultPage getLookupResultPage() {

        return ( lookupResultPage == null) ? lookupResultPage = new LookupResultPage(driver) : lookupResultPage;

    }

    public CareerCounselingPage getCarrerCaunselingPage() {

        return ( careerCounselingPage == null) ? careerCounselingPage = new CareerCounselingPage(driver) : careerCounselingPage;

    }

    public PMKVYDashboardPage getPMKYDHashboard() {
        return ( pMKVYDashboardPage == null) ? pMKVYDashboardPage = new PMKVYDashboardPage(driver) : pMKVYDashboardPage;
    }

    public MyDashboardPage getmyDashboardPage() {

        return (myDashboardPage == null) ? myDashboardPage = new MyDashboardPage(driver) : myDashboardPage;

    }

    public DashboardPage getDashboardPage() {
        return ( dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage;
    }


    public CoursesPage getCoursesPage() {
        return ( coursesPage == null) ? coursesPage = new CoursesPage(driver) : coursesPage;
    }


    public OpportunitiesPage getOpportunityPage() {
        return ( opportunitiesPage == null) ? opportunitiesPage = new OpportunitiesPage(driver) : opportunitiesPage;
    }


    public TrainingCentrePage getTrainingCentrePage() {
        return ( trainingCentrePage == null) ? trainingCentrePage = new TrainingCentrePage(driver) : trainingCentrePage;
    }

    public AwardingBodyPage getAwardingBodyPage() {
        return ( awardingBodyPage == null) ? awardingBodyPage = new AwardingBodyPage(driver) : awardingBodyPage;
    }

    public AssessmentAgencyPage getAssessmentAgencyPage() {
        return ( assessmentAgencyPage == null) ? assessmentAgencyPage = new AssessmentAgencyPage(driver) : assessmentAgencyPage;
    }

    public AssessorPage getAssessorPage() {
        return ( assessorPage == null) ? assessorPage = new AssessorPage(driver) : assessorPage;
    }

    public ITIStatePage getITIStatePage() {
        return ( itiStatePage == null) ? itiStatePage = new ITIStatePage(driver) : itiStatePage;
    }


    public CourseDetailPage getCourseDetailPage() {
        return ( courseDetailPage == null) ? courseDetailPage = new CourseDetailPage(driver) : courseDetailPage;
    }
    
    public CourseCreatePage getCourseCreatePage() {
        return ( courseCreatePage == null) ? courseCreatePage = new CourseCreatePage(driver) : courseCreatePage;
    }
    
    public JobDetailsPage getJobDetailsPage() {
        return ( jobDetailsPage == null) ? jobDetailsPage = new JobDetailsPage(driver) : jobDetailsPage;
    }
    
    public ContentListPage getContentListPage(){
        return (contentListPage==null) ? contentListPage =new ContentListPage(driver) : contentListPage;
    }

    public SkillUniversitiesPage getSkillUniversitiesPage(){
        return (skillUniversitiesPage==null) ? skillUniversitiesPage =new SkillUniversitiesPage(driver) : skillUniversitiesPage;
    }

    public SchemeDetailsPage getSchemeDetailsPage(){
        return (schemeDetailsPage==null) ? schemeDetailsPage =new SchemeDetailsPage(driver) : schemeDetailsPage;
    }

    public ProfileDetailsPage getProfileDetailsPage(){
        return (profileDetailsPage==null) ? profileDetailsPage =new ProfileDetailsPage(driver) : profileDetailsPage;
    }



}