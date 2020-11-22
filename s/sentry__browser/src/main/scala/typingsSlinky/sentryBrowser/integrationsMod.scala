package typingsSlinky.sentryBrowser

import typingsSlinky.sentryBrowser.anon.Key
import typingsSlinky.sentryBrowser.anon.PartialBreadcrumbsOptions
import typingsSlinky.sentryBrowser.anon.PartialTryCatchOptions
import typingsSlinky.sentryBrowser.globalhandlersMod.GlobalHandlersIntegrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations", JSImport.Namespace)
@js.native
object integrationsMod extends js.Object {
  
  @js.native
  /**
    * @inheritDoc
    */
  class Breadcrumbs ()
    extends typingsSlinky.sentryBrowser.breadcrumbsMod.Breadcrumbs {
    def this(options: PartialBreadcrumbsOptions) = this()
  }
  /* static members */
  @js.native
  object Breadcrumbs extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  /** JSDoc */
  class GlobalHandlers ()
    extends typingsSlinky.sentryBrowser.globalhandlersMod.GlobalHandlers {
    def this(options: GlobalHandlersIntegrations) = this()
  }
  /* static members */
  @js.native
  object GlobalHandlers extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  /**
    * @inheritDoc
    */
  class LinkedErrors ()
    extends typingsSlinky.sentryBrowser.linkederrorsMod.LinkedErrors {
    def this(options: Key) = this()
  }
  /* static members */
  @js.native
  object LinkedErrors extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  /**
    * @inheritDoc
    */
  class TryCatch ()
    extends typingsSlinky.sentryBrowser.trycatchMod.TryCatch {
    def this(options: PartialTryCatchOptions) = this()
  }
  /* static members */
  @js.native
  object TryCatch extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
  
  @js.native
  class UserAgent ()
    extends typingsSlinky.sentryBrowser.useragentMod.UserAgent
  /* static members */
  @js.native
  object UserAgent extends js.Object {
    
    /**
      * @inheritDoc
      */
    var id: String = js.native
  }
}
