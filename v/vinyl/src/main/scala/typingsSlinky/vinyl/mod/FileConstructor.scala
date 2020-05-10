package typingsSlinky.vinyl.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.vinyl.ConstructorOptionscontent
import typingsSlinky.vinyl.ConstructorOptionscontentBase
import typingsSlinky.vinyl.ConstructorOptionscontentDictcustomOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConstructor
  extends Instantiable0[org.scalajs.dom.raw.File]
     with Instantiable1[
      (/* options */ ConstructorOptions) | (/* options */ ConstructorOptionscontent) | (/* options */ ConstructorOptionscontentBase) | (/* options */ ConstructorOptionscontentDictcustomOption), 
      BufferFile | org.scalajs.dom.raw.File | NullFile | StreamFile
    ] {
  /**
    * Checks if a property is not managed internally.
    */
  def isCustomProp(name: String): Boolean = js.native
  /**
    * Checks if a given object is a vinyl file.
    */
  def isVinyl(obj: js.Any): /* is std.File */ Boolean = js.native
}

