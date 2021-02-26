package typingsSlinky.sentryHub

import typingsSlinky.sentryHub.anon.OmitSessionContextstarted
import typingsSlinky.sentryHub.interfacesMod.Carrier
import typingsSlinky.sentryHub.interfacesMod.DomainAsCarrier
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/hub", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  class Hub ()
    extends typingsSlinky.sentryHub.hubMod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: Client[Options], scope: typingsSlinky.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  @JSImport("@sentry/hub", "Scope")
  @js.native
  class Scope ()
    extends typingsSlinky.sentryHub.scopeMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/hub", "Scope.clone")
    @js.native
    def clone(scope: typingsSlinky.sentryHub.scopeMod.Scope): typingsSlinky.sentryHub.scopeMod.Scope = js.native
  }
  
  @JSImport("@sentry/hub", "Session")
  @js.native
  class Session ()
    extends typingsSlinky.sentryHub.sessionMod.Session {
    def this(context: OmitSessionContextstarted) = this()
  }
  
  @JSImport("@sentry/hub", "addGlobalEventProcessor")
  @js.native
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  @JSImport("@sentry/hub", "getActiveDomain")
  @js.native
  def getActiveDomain(): js.UndefOr[DomainAsCarrier] = js.native
  
  @JSImport("@sentry/hub", "getCurrentHub")
  @js.native
  def getCurrentHub(): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/hub", "getHubFromCarrier")
  @js.native
  def getHubFromCarrier(carrier: Carrier): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/hub", "getMainCarrier")
  @js.native
  def getMainCarrier(): Carrier = js.native
  
  @JSImport("@sentry/hub", "makeMain")
  @js.native
  def makeMain(hub: typingsSlinky.sentryHub.hubMod.Hub): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  @JSImport("@sentry/hub", "setHubOnCarrier")
  @js.native
  def setHubOnCarrier(carrier: Carrier, hub: typingsSlinky.sentryHub.hubMod.Hub): Boolean = js.native
}
