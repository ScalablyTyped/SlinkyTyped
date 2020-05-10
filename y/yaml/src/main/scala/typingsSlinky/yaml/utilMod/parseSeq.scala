package typingsSlinky.yaml.utilMod

import typingsSlinky.yaml.mod.Document
import typingsSlinky.yaml.parseCstMod.CST.FlowSeq
import typingsSlinky.yaml.parseCstMod.CST.Seq
import typingsSlinky.yaml.typesMod.AST.BlockSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/util", "parseSeq")
@js.native
object parseSeq extends js.Object {
  def apply(doc: Document, cst: FlowSeq): typingsSlinky.yaml.typesMod.AST.FlowSeq = js.native
  def apply(doc: Document, cst: Seq): BlockSeq = js.native
}

