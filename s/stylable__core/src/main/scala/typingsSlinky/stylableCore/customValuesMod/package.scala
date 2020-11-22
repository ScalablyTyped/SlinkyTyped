package typingsSlinky.stylableCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object customValuesMod {
  
  type BoxedValueArray = js.Array[
    java.lang.String | (typingsSlinky.stylableCore.customValuesMod.Box_[java.lang.String, js.Any])
  ]
  
  type BoxedValueMap = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | (typingsSlinky.stylableCore.customValuesMod.Box_[java.lang.String, js.Any])
  ]
  
  type CustomTypes = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.stylableCore.customValuesMod.CustomValueExtension[js.Any]
  ]
}
