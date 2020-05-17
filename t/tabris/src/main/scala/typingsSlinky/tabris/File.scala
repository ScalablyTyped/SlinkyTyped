package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// File
/**
  * Represents raw data of a given type and name.
  */
@js.native
trait File extends Blob {
  /**
    * Unix timestamp of the last known modification of the file
    * @constant
    */
  val lastModified: Double = js.native
  /**
    * The name or path of the file
    * @constant
    */
  val name: String = js.native
}

object File {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    lastModified: Double,
    name: String,
    size: Double,
    text: () => js.Promise[String],
    `type`: String
  ): File = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

