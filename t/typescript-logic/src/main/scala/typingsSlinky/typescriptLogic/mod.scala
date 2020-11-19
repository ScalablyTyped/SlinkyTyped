package typingsSlinky.typescriptLogic

import typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`
import typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-logic", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`
    - typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`
  */
  trait Not[X /* <: Boolean */] extends js.Object
  
  type And[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `false`, `false`, `false`]
  
  type If[Boolean /* <: scala.Boolean */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  
  type LogicalTable[A /* <: Boolean */, B /* <: Boolean */, AB, AnB, nAB, nAnB] = nAnB | nAB | AnB | AB
  
  type Or[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `true`, `true`, `false`]
  
  type Xor[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `false`, `true`, `true`, `false`]
}
