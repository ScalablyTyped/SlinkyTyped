package typingsSlinky.snykRpmParser

import typingsSlinky.node.Buffer
import typingsSlinky.snykRpmParser.distTypesMod.IParserResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getPackages(data: Buffer): js.Promise[IParserResponse] = js.native
}

