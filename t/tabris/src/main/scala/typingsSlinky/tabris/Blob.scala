package typingsSlinky.tabris

import typingsSlinky.tabris.mod.ImageValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Blob
/**
  * Represents raw data of a given type.
  */
@js.native
trait Blob extends ImageValue {
  /**
    * Size of the blob data in bytes
    * @constant
    */
  val size: Double = js.native
  /**
    * The MIME type of the blob data
    * @constant
    */
  val `type`: String = js.native
  /**
    * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
    * in-memory copy of the data.
    */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Decodes the blob data as a string and returns it in a promise.
    */
  def text(): js.Promise[String] = js.native
}

object Blob {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    size: Double,
    text: () => js.Promise[String],
    `type`: String
  ): Blob = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  @scala.inline
  implicit class BlobOps[Self <: Blob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

