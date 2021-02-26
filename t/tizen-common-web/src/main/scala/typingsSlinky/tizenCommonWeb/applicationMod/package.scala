package typingsSlinky.tizenCommonWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object applicationMod {
  
  type ApplicationContextArraySuccessCallback = js.Function1[
    /* contexts */ js.Array[typingsSlinky.tizenCommonWeb.applicationMod.ApplicationContext], 
    scala.Unit
  ]
  
  type ApplicationContextId = java.lang.String
  
  type ApplicationId = java.lang.String
  
  type ApplicationInformationArraySuccessCallback = js.Function1[
    /* informationArray */ js.Array[typingsSlinky.tizenCommonWeb.applicationMod.ApplicationInformation], 
    scala.Unit
  ]
  
  type EventCallback = js.Function2[
    /* event */ typingsSlinky.tizenCommonWeb.applicationMod.EventInfo, 
    /* data */ typingsSlinky.tizenCommonWeb.applicationMod.EventData, 
    scala.Unit
  ]
  
  type EventData = typingsSlinky.tizenCommonWeb.applicationMod.SystemEventData | typingsSlinky.tizenCommonWeb.applicationMod.UserEventData
  
  type FindAppControlSuccessCallback = js.Function2[
    /* informationArray */ js.Array[typingsSlinky.tizenCommonWeb.applicationMod.ApplicationInformation], 
    /* appControl */ typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControl, 
    scala.Unit
  ]
  
  type StatusEventCallback = js.Function2[
    /* appId */ typingsSlinky.tizenCommonWeb.applicationMod.ApplicationId, 
    /* isActive */ scala.Boolean, 
    scala.Unit
  ]
  
  type UserEventData = js.Object
}
