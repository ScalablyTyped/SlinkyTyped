package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ImageUtils")
@js.native
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(url: String, mapping: typingsSlinky.three.srcConstantsMod.Mapping): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsSlinky.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsSlinky.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String]): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: typingsSlinky.three.srcConstantsMod.Mapping): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsSlinky.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsSlinky.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.srcTexturesTextureMod.Texture = js.native
}

