package typingsSlinky.stylableRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type STFunction = js.Function3[
    /* context */ java.lang.String, 
    /* stateOrClass */ js.UndefOr[java.lang.String | typingsSlinky.stylableRuntime.typesMod.StateMap], 
    /* repeated */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  type StateMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.stylableRuntime.typesMod.StateValue]
  
  type StateValue = scala.Boolean | scala.Double | java.lang.String
}
