package typingsSlinky.tesseractDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tesseractDotJsMod {
  import org.scalajs.dom.raw.Blob
  import org.scalajs.dom.raw.CanvasRenderingContext2D
  import org.scalajs.dom.raw.File
  import org.scalajs.dom.raw.HTMLCanvasElement
  import org.scalajs.dom.raw.HTMLImageElement
  import org.scalajs.dom.raw.HTMLVideoElement
  import org.scalajs.dom.raw.ImageData
  import typingsSlinky.node.Buffer

  type ImageLike = String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | CanvasRenderingContext2D | File | Blob | ImageData | Buffer
}
