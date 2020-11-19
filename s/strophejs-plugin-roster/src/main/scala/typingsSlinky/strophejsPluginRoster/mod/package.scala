package typingsSlinky.strophejsPluginRoster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IqCallback = js.Function1[/* stanza */ org.scalajs.dom.raw.Element, js.Any]
  
  type IqID = java.lang.String
  
  type PresenceRequestCallback = js.Function1[/* from */ java.lang.String, js.Any]
  
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[typingsSlinky.strophejsPluginRoster.mod.RosterItem], 
    /* item */ typingsSlinky.strophejsPluginRoster.mod.RosterItem, 
    /* previousItem */ typingsSlinky.strophejsPluginRoster.mod.RosterItem, 
    js.Any
  ]
}
