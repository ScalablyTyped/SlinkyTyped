package typingsSlinky.snykRpmParser

import typingsSlinky.node.Buffer
import typingsSlinky.snykRpmParser.rpmTypesMod.PackageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/rpm", JSImport.Namespace)
@js.native
object rpmMod extends js.Object {
  def bufferToPackageInfo(data: Buffer): js.Promise[js.UndefOr[PackageInfo]] = js.native
}

