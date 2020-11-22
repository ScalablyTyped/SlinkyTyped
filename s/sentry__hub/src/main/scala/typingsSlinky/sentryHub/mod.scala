package typingsSlinky.sentryHub

import typingsSlinky.sentryHub.anon.OmitSessionContextstarted
import typingsSlinky.sentryHub.interfacesMod.Carrier
import typingsSlinky.sentryHub.interfacesMod.DomainAsCarrier
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/hub", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  def getActiveDomain(): js.UndefOr[DomainAsCarrier] = js.native
  
  def getCurrentHub(): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  def getHubFromCarrier(carrier: Carrier): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  def getMainCarrier(): Carrier = js.native
  
  def makeMain(hub: typingsSlinky.sentryHub.hubMod.Hub): typingsSlinky.sentryHub.hubMod.Hub = js.native
  
  def setHubOnCarrier(carrier: Carrier, hub: typingsSlinky.sentryHub.hubMod.Hub): Boolean = js.native
  
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
  
  @js.native
  class Scope ()
    extends typingsSlinky.sentryHub.scopeMod.Scope
  /* static members */
  @js.native
  object Scope extends js.Object {
    
    def clone(scope: typingsSlinky.sentryHub.scopeMod.Scope): typingsSlinky.sentryHub.scopeMod.Scope = js.native
  }
  
  @js.native
  class Session ()
    extends typingsSlinky.sentryHub.sessionMod.Session {
    def this(context: OmitSessionContextstarted) = this()
  }
}
