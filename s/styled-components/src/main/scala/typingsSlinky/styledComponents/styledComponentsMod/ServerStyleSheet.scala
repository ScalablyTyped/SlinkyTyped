package typingsSlinky.styledComponents.styledComponentsMod

import slinky.core.facade.ReactElement
import typingsSlinky.styledComponents.styledComponentsMod.global.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "ServerStyleSheet")
@js.native
class ServerStyleSheet () extends js.Object {
  val instance: this.type = js.native
  def collectStyles(tree: ReactElement): ReactElement = js.native
  def getStyleElement(): js.Array[ReactElement] = js.native
  def getStyleTags(): String = js.native
  def interleaveWithNodeStream(readableStream: ReadableStream): ReadableStream = js.native
  def seal(): Unit = js.native
}

