package typingsSlinky.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "ImageUtils")
@js.native
object ImageUtils extends js.Object {
  
  var crossOrigin: String = js.native
  
  def getDataURL(image: js.Any): String = js.native
  
  def loadTexture(url: String): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(url: String, mapping: typingsSlinky.three.constantsMod.Mapping): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsSlinky.three.constantsMod.Mapping,
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsSlinky.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsSlinky.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  
  def loadTextureCube(array: js.Array[String]): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: typingsSlinky.three.constantsMod.Mapping): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsSlinky.three.constantsMod.Mapping,
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsSlinky.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsSlinky.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsSlinky.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsSlinky.three.textureMod.Texture = js.native
}
