package typingsSlinky.twilioChat

import typingsSlinky.twilioChat.sessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumptionhorizonMod {
  
  /**
    * @classdesc Provides consumption horizon management functionality
    */
  @JSImport("twilio-chat/lib/services/consumptionhorizon", "ConsumptionHorizon")
  @js.native
  class ConsumptionHorizon protected () extends StObject {
    def this(services: ConsumptionHorizonServices) = this()
    
    var addPendingConsumptionHorizonRequest: js.Any = js.native
    
    /**
      * Move consumption horizon forward
      */
    def advanceLastConsumedMessageIndexForChannel(channelSid: String, messageIdx: Double, currentChannelLastConsumedIndex: Double): js.Promise[Double] = js.native
    
    val consumptionHorizonRequests: js.Any = js.native
    
    var consumptionHorizonUpdateTimer: js.Any = js.native
    
    var delayedSendConsumptionHorizon: js.Any = js.native
    
    var getReportInterval: js.Any = js.native
    
    var processConsumptionReportError: js.Any = js.native
    
    var processConsumptionReportResponse: js.Any = js.native
    
    var sendConsumptionReport: js.Any = js.native
    
    val services: js.Any = js.native
    
    /**
      * Updates consumption horizon value without any checks
      */
    def updateLastConsumedMessageIndexForChannel(channelSid: String, messageIdx: Double): js.Promise[Double] = js.native
  }
  
  @js.native
  trait ConsumptionHorizonServices extends StObject {
    
    var session: Session = js.native
  }
  object ConsumptionHorizonServices {
    
    @scala.inline
    def apply(session: Session): ConsumptionHorizonServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumptionHorizonServices]
    }
    
    @scala.inline
    implicit class ConsumptionHorizonServicesMutableBuilder[Self <: ConsumptionHorizonServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
