package typingsSlinky.stylableCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectorUtilsMod {
  
  type Visitor = js.Function3[
    /* node */ typingsSlinky.stylableCore.selectorUtilsMod.SelectorAstNode, 
    /* index */ scala.Double, 
    /* nodes */ js.Array[typingsSlinky.stylableCore.selectorUtilsMod.SelectorAstNode], 
    scala.Boolean | scala.Unit
  ]
}
