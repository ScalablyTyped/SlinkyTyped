package typingsSlinky.typescriptLogic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type And[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = typingsSlinky.typescriptLogic.mod.LogicalTable[
    A, 
    B, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`
  ]
  type Or[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = typingsSlinky.typescriptLogic.mod.LogicalTable[
    A, 
    B, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`
  ]
  type Xor[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = typingsSlinky.typescriptLogic.mod.LogicalTable[
    A, 
    B, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`true`, 
    typingsSlinky.typescriptLogic.typescriptLogicBooleans.`false`
  ]
}
