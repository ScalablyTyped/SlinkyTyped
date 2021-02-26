package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object zepto {
  
  // Before sending the request, can be cancelled
  // event name: ajaxBeforeSend
  type ZeptoAjaxBeforeSendEvent = js.Function2[
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* options */ typingsSlinky.zepto.ZeptoAjaxSettings, 
    scala.Unit
  ]
  
  // After request has completed, regardless of error or success
  // event name: ajaxComplete
  type ZeptoAjaxCompleteEvent = js.Function2[
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* options */ typingsSlinky.zepto.ZeptoAjaxSettings, 
    scala.Unit
  ]
  
  // When there was an error
  // event name: ajaxError
  type ZeptoAjaxErrorEvent = js.Function3[
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* options */ typingsSlinky.zepto.ZeptoAjaxSettings, 
    /* error */ js.Error, 
    scala.Unit
  ]
  
  // Like ajaxBeforeSend, but not cancellable
  // event name: ajaxSend
  type ZeptoAjaxSendEvent = js.Function2[
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* options */ typingsSlinky.zepto.ZeptoAjaxSettings, 
    scala.Unit
  ]
  
  // Fired if no other ajax requests are currently active
  // event name: ajaxStart
  type ZeptoAjaxStartEvent = js.Function0[scala.Unit]
  
  // Fired if this was the last active Ajax request.
  // event name: ajaxStop
  type ZeptoAjaxStopEvent = js.Function0[scala.Unit]
  
  // When the response is success
  // event name: ajaxSuccess
  type ZeptoAjaxSuccessEvent = js.Function3[
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* options */ typingsSlinky.zepto.ZeptoAjaxSettings, 
    /* data */ js.Any, 
    scala.Unit
  ]
  
  type ZeptoEventHandler = js.Function2[/* e */ org.scalajs.dom.raw.Event, /* repeated */ js.Any, js.Any]
  
  type ZeptoEventHandlers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.zepto.ZeptoEventHandler]
}
