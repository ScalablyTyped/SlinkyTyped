package typingsSlinky.snykRpmParser

import typingsSlinky.node.Buffer
import typingsSlinky.snykRpmParser.rpmTypesMod.IndexEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/rpm/header", JSImport.Namespace)
@js.native
object headerMod extends js.Object {
  def headerImport(data: Buffer): js.Promise[js.Array[IndexEntry]] = js.native
}

