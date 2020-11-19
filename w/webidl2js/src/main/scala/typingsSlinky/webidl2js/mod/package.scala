package typingsSlinky.webidl2js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributeProcessor = js.ThisFunction2[
    /* this */ typingsSlinky.webidl2js.mod.ProcessorContext, 
    /* idl */ typingsSlinky.webidl2.mod.AttributeMemberType, 
    /* implName */ java.lang.String, 
    typingsSlinky.webidl2js.anon.Get
  ]
  
  type CodeProcessor = js.ThisFunction1[
    /* this */ typingsSlinky.webidl2js.mod.ProcessorContext, 
    /* code */ java.lang.String, 
    java.lang.String
  ]
}
