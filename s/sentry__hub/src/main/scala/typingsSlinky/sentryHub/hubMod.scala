package typingsSlinky.sentryHub

import typingsSlinky.sentryHub.interfacesMod.Carrier
import typingsSlinky.sentryHub.interfacesMod.DomainAsCarrier
import typingsSlinky.sentryHub.interfacesMod.Layer
import typingsSlinky.sentryHub.scopeMod.Scope
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/hub/dist/hub", JSImport.Namespace)
@js.native
object hubMod extends js.Object {
  
  val API_VERSION: /* 3 */ Double = js.native
  
  def getActiveDomain(): js.UndefOr[DomainAsCarrier] = js.native
  
  def getCurrentHub(): Hub = js.native
  
  def getHubFromCarrier(carrier: Carrier): Hub = js.native
  
  def getMainCarrier(): Carrier = js.native
  
  def makeMain(hub: Hub): Hub = js.native
  
  def setHubOnCarrier(carrier: Carrier, hub: Hub): Boolean = js.native
  
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
    extends typingsSlinky.sentryTypes.hubMod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: Scope) = this()
    def this(client: Client[Options], scope: Scope) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: js.UndefOr[scala.Nothing], scope: Scope, _version: Double) = this()
    def this(client: Client[Options], scope: js.UndefOr[scala.Nothing], _version: Double) = this()
    def this(client: Client[Options], scope: Scope, _version: Double) = this()
    
    /**
      * Calls global extension method and binding current instance to the function call
      */
    var _callExtensionMethod: js.Any = js.native
    
    /**
      * Internal helper function to call a method on the top client if it exists.
      *
      * @param method The method to call on the client.
      * @param args Arguments to pass to the client function.
      */
    var _invokeClient: js.Any = js.native
    
    /** Contains the last event id of a captured event.  */
    var _lastEventId: js.Any = js.native
    
    /** Is a {@link Layer}[] containing the client and scope */
    val _stack: js.Any = js.native
    
    val _version: js.Any = js.native
    
    /** Returns the scope of the top stack. */
    def getScope(): js.UndefOr[Scope] = js.native
    
    /** Returns the scope stack for domains or the process. */
    def getStack(): js.Array[Layer] = js.native
    
    /** Returns the topmost scope layer in the order domain > local > process. */
    def getStackTop(): Layer = js.native
  }
}
