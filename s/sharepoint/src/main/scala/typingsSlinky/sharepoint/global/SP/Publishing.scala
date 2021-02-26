package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.SP.Taxonomy.Term
import typingsSlinky.sharepoint.SP.Taxonomy.TermSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Publishing {
  
  @JSGlobal("SP.Publishing.AddinPlugin")
  @js.native
  class AddinPlugin protected ()
    extends typingsSlinky.sharepoint.SP.Publishing.AddinPlugin {
    def this(ctx: typingsSlinky.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Publishing.AddinSettings")
  @js.native
  class AddinSettings protected ()
    extends typingsSlinky.sharepoint.SP.Publishing.AddinSettings {
    def this(ctx: typingsSlinky.sharepoint.SP.ClientContext, id: typingsSlinky.sharepoint.SP.Guid) = this()
  }
  
  @JSGlobal("SP.Publishing.CustomizableString")
  @js.native
  class CustomizableString ()
    extends typingsSlinky.sharepoint.SP.Publishing.CustomizableString
  
  @JSGlobal("SP.Publishing.DesignPackage")
  @js.native
  class DesignPackage ()
    extends typingsSlinky.sharepoint.SP.Publishing.DesignPackage
  object DesignPackage {
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.apply")
    @js.native
    def apply(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      site: typingsSlinky.sharepoint.SP.Site,
      info: typingsSlinky.sharepoint.SP.Publishing.DesignPackageInfo
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.exportEnterprise")
    @js.native
    def exportEnterprise(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      site: typingsSlinky.sharepoint.SP.Site,
      includeSearchConfiguration: Boolean
    ): typingsSlinky.sharepoint.SP.ClientResult[typingsSlinky.sharepoint.SP.Publishing.DesignPackageInfo] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.exportSmallBusiness")
    @js.native
    def exportSmallBusiness(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      site: typingsSlinky.sharepoint.SP.Site,
      packageName: String,
      includeSearchConfiguration: Boolean
    ): typingsSlinky.sharepoint.SP.ClientResult[typingsSlinky.sharepoint.SP.Publishing.DesignPackageInfo] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.install")
    @js.native
    def install(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      site: typingsSlinky.sharepoint.SP.Site,
      info: typingsSlinky.sharepoint.SP.Publishing.DesignPackageInfo,
      path: String
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.DesignPackage.uninstall")
    @js.native
    def uninstall(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      site: typingsSlinky.sharepoint.SP.Site,
      info: typingsSlinky.sharepoint.SP.Publishing.DesignPackageInfo
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.DesignPackageInfo")
  @js.native
  class DesignPackageInfo ()
    extends typingsSlinky.sharepoint.SP.Publishing.DesignPackageInfo
  
  @JSGlobal("SP.Publishing.ImageRendition")
  @js.native
  class ImageRendition ()
    extends typingsSlinky.sharepoint.SP.Publishing.ImageRendition
  
  object Navigation {
    
    @JSGlobal("SP.Publishing.Navigation.NavigationLinkType")
    @js.native
    object NavigationLinkType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationLinkType with Double] = js.native
      
      /* 1 */ val friendlyUrl: typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationLinkType.friendlyUrl with Double = js.native
      
      /* 0 */ val root: typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationLinkType.root with Double = js.native
      
      /* 2 */ val simpleLink: typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationLinkType.simpleLink with Double = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTerm")
    @js.native
    class NavigationTerm ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTerm
    object NavigationTerm {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTerm.getAsResolvedByView")
      @js.native
      def getAsResolvedByView(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        term: Term,
        view: typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
      ): typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTerm = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTerm.getAsResolvedByWeb")
      @js.native
      def getAsResolvedByWeb(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        term: Term,
        web: typingsSlinky.sharepoint.SP.Web,
        siteMapProviderName: String
      ): typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTerm = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
    @js.native
    class NavigationTermSet ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSet
    object NavigationTermSet {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSet.getAsResolvedByView")
      @js.native
      def getAsResolvedByView(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        termSet: TermSet,
        view: typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetView
      ): typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSet.getAsResolvedByWeb")
      @js.native
      def getAsResolvedByWeb(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        termSet: TermSet,
        web: typingsSlinky.sharepoint.SP.Web,
        siteMapProviderName: String
      ): typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSetItem")
    @js.native
    class NavigationTermSetItem ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
    
    @JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
    @js.native
    class NavigationTermSetView protected ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetView {
      def this(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        web: typingsSlinky.sharepoint.SP.Web,
        siteMapProviderName: String
      ) = this()
    }
    object NavigationTermSetView {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.NavigationTermSetView.createEmptyInstance")
      @js.native
      def createEmptyInstance(context: typingsSlinky.sharepoint.SP.ClientContext): typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSetView = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.StandardNavigationSettings")
    @js.native
    class StandardNavigationSettings ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.StandardNavigationSettings
    
    @JSGlobal("SP.Publishing.Navigation.StandardNavigationSource")
    @js.native
    object StandardNavigationSource extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.sharepoint.SP.Publishing.Navigation.StandardNavigationSource with Double
          ] = js.native
      
      /* 3 */ val inheritFromParentWeb: typingsSlinky.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.inheritFromParentWeb with Double = js.native
      
      /* 1 */ val portalProvider: typingsSlinky.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.portalProvider with Double = js.native
      
      /* 2 */ val taxonomyProvider: typingsSlinky.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.taxonomyProvider with Double = js.native
      
      /* 0 */ val unknown: typingsSlinky.sharepoint.SP.Publishing.Navigation.StandardNavigationSource.unknown with Double = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation")
    @js.native
    class TaxonomyNavigation ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.TaxonomyNavigation
    object TaxonomyNavigation {
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.flushSiteFromCache")
      @js.native
      def flushSiteFromCache(context: typingsSlinky.sharepoint.SP.ClientContext, site: typingsSlinky.sharepoint.SP.Site): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.flushTermSetFromCache")
      @js.native
      def flushTermSetFromCache(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        webForPermissions: typingsSlinky.sharepoint.SP.Web,
        termStoreId: typingsSlinky.sharepoint.SP.Guid,
        termSetId: typingsSlinky.sharepoint.SP.Guid
      ): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.flushWebFromCache")
      @js.native
      def flushWebFromCache(context: typingsSlinky.sharepoint.SP.ClientContext, web: typingsSlinky.sharepoint.SP.Web): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.getNavigationLcidForWeb")
      @js.native
      def getNavigationLcidForWeb(context: typingsSlinky.sharepoint.SP.ClientContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.IntResult = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.getTermSetForWeb")
      @js.native
      def getTermSetForWeb(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        web: typingsSlinky.sharepoint.SP.Web,
        siteMapProviderName: String,
        includeInheritedSettings: Boolean
      ): typingsSlinky.sharepoint.SP.Publishing.Navigation.NavigationTermSet = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.getWebNavigationSettings")
      @js.native
      def getWebNavigationSettings(context: typingsSlinky.sharepoint.SP.ClientContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.Publishing.Navigation.WebNavigationSettings = js.native
      
      /* static member */
      @JSGlobal("SP.Publishing.Navigation.TaxonomyNavigation.setCrawlAsFriendlyUrlPage")
      @js.native
      def setCrawlAsFriendlyUrlPage(
        context: typingsSlinky.sharepoint.SP.ClientContext,
        navigationTerm: Term,
        crawlAsFriendlyUrlPage: Boolean
      ): typingsSlinky.sharepoint.SP.BooleanResult = js.native
    }
    
    @JSGlobal("SP.Publishing.Navigation.WebNavigationSettings")
    @js.native
    class WebNavigationSettings protected ()
      extends typingsSlinky.sharepoint.SP.Publishing.Navigation.WebNavigationSettings {
      def this(context: typingsSlinky.sharepoint.SP.ClientContext, web: typingsSlinky.sharepoint.SP.Web) = this()
    }
  }
  
  @JSGlobal("SP.Publishing.PageLayoutCreationInformation")
  @js.native
  class PageLayoutCreationInformation ()
    extends typingsSlinky.sharepoint.SP.Publishing.PageLayoutCreationInformation
  
  @JSGlobal("SP.Publishing.PublishingPage")
  @js.native
  class PublishingPage ()
    extends typingsSlinky.sharepoint.SP.Publishing.PublishingPage
  object PublishingPage {
    
    /* static member */
    @JSGlobal("SP.Publishing.PublishingPage.getPublishingPage")
    @js.native
    def getPublishingPage(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      sourceListItem: typingsSlinky.sharepoint.SP.ListItem[_]
    ): typingsSlinky.sharepoint.SP.Publishing.PublishingPage = js.native
  }
  
  @JSGlobal("SP.Publishing.PublishingPageInformation")
  @js.native
  class PublishingPageInformation ()
    extends typingsSlinky.sharepoint.SP.Publishing.PublishingPageInformation
  
  @JSGlobal("SP.Publishing.PublishingSite")
  @js.native
  class PublishingSite ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  object PublishingSite {
    
    /* static member */
    @JSGlobal("SP.Publishing.PublishingSite.createPageLayout")
    @js.native
    def createPageLayout(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      parameters: typingsSlinky.sharepoint.SP.Publishing.PageLayoutCreationInformation
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.PublishingWeb")
  @js.native
  class PublishingWeb ()
    extends typingsSlinky.sharepoint.SP.Publishing.PublishingWeb
  object PublishingWeb {
    
    /* static member */
    @JSGlobal("SP.Publishing.PublishingWeb.getPublishingWeb")
    @js.native
    def getPublishingWeb(context: typingsSlinky.sharepoint.SP.ClientContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.Publishing.PublishingWeb = js.native
  }
  
  @JSGlobal("SP.Publishing.ScheduledItem")
  @js.native
  class ScheduledItem ()
    extends typingsSlinky.sharepoint.SP.Publishing.ScheduledItem
  
  @JSGlobal("SP.Publishing.SiteImageRenditions")
  @js.native
  class SiteImageRenditions ()
    extends typingsSlinky.sharepoint.SP.Publishing.SiteImageRenditions
  object SiteImageRenditions {
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteImageRenditions.getRenditions")
    @js.native
    def getRenditions(context: typingsSlinky.sharepoint.SP.ClientContext): js.Array[typingsSlinky.sharepoint.SP.Publishing.ImageRendition] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteImageRenditions.setRenditions")
    @js.native
    def setRenditions(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      renditions: js.Array[typingsSlinky.sharepoint.SP.Publishing.ImageRendition]
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.SiteServicesAddins")
  @js.native
  class SiteServicesAddins ()
    extends typingsSlinky.sharepoint.SP.Publishing.SiteServicesAddins
  object SiteServicesAddins {
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.deletePlugin")
    @js.native
    def deletePlugin(context: typingsSlinky.sharepoint.SP.ClientContext, pluginName: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.deleteSettings")
    @js.native
    def deleteSettings(context: typingsSlinky.sharepoint.SP.ClientContext, addinId: typingsSlinky.sharepoint.SP.Guid): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.getPlugin")
    @js.native
    def getPlugin(context: typingsSlinky.sharepoint.SP.ClientContext, pluginName: String): typingsSlinky.sharepoint.SP.Publishing.AddinPlugin = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.getSettings")
    @js.native
    def getSettings(context: typingsSlinky.sharepoint.SP.ClientContext, addinId: typingsSlinky.sharepoint.SP.Guid): typingsSlinky.sharepoint.SP.Publishing.AddinSettings = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.setPlugin")
    @js.native
    def setPlugin(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      addin: typingsSlinky.sharepoint.SP.Publishing.AddinPlugin
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.SiteServicesAddins.setSettings")
    @js.native
    def setSettings(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      addin: typingsSlinky.sharepoint.SP.Publishing.AddinSettings
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Publishing.VariationLabel")
  @js.native
  class VariationLabel ()
    extends typingsSlinky.sharepoint.SP.Publishing.VariationLabel
  
  @JSGlobal("SP.Publishing.Variations")
  @js.native
  class Variations ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  object Variations {
    
    /* static member */
    @JSGlobal("SP.Publishing.Variations.getLabels")
    @js.native
    def getLabels(context: typingsSlinky.sharepoint.SP.ClientContext): typingsSlinky.sharepoint.SP.ClientObjectList[typingsSlinky.sharepoint.SP.Publishing.VariationLabel] = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.Variations.getPeerUrl")
    @js.native
    def getPeerUrl(context: typingsSlinky.sharepoint.SP.ClientContext, currentUrl: String, labelTitle: String): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Publishing.Variations.updateListItems")
    @js.native
    def updateListItems(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      listId: typingsSlinky.sharepoint.SP.Guid,
      itemIds: js.Array[Double]
    ): Unit = js.native
  }
}
