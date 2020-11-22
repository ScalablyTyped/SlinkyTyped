package typingsSlinky.ziggyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EncodeURIParamType = java.lang.String | scala.Double | scala.Boolean
  
  type InputParams = typingsSlinky.ziggyJs.mod.NormalizedParams | typingsSlinky.ziggyJs.mod.InputValue
  
  type InputValue = typingsSlinky.ziggyJs.anon.Id | typingsSlinky.ziggyJs.mod.EncodeURIParamType
  
  type NormalizedParams = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ziggyJs.mod.InputValue] | js.Array[typingsSlinky.ziggyJs.mod.InputValue]
}
