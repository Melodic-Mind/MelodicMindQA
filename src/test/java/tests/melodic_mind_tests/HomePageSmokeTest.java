package tests.melodic_mind_tests;

import org.testng.annotations.Test;
import tests.BaseTests;

public class HomePageSmokeTest extends BaseTests {

    @Test
    public void checkMostImportantElements() {
        app.mmHomePage().isHeaderElementsAppeared();
        app.mmHomePage().isLaVocalOpenButtonAppeared();
        app.mmHomePage().isMusicGuruOpenButtonAppeared();
        app.mmHomePage().isSongWriterStudioLearnMoreButtonAppeared();
        app.mmHomePage().isEarWizardLearnMoreButtonAppeared();
        app.mmHomePage().isSubscribeButtonAppeared();
        app.mmHomePage().isDiscordButtonAppeared();
        app.mmHomePage().isTikTokButtonButtonAppeared();
        app.mmHomePage().isYouTubeButtonAppeared();
        app.mmHomePage().isTwitterButtonAppeared();
        app.mmHomePage().isFacebookButtonAppeared();
        app.mmHomePage().isInstagramButtonAppeared();
        app.mmHomePage().isEMailButtonAppeared();
        app.mmHomePage().isFooterElementsAppeared();
    }
}
