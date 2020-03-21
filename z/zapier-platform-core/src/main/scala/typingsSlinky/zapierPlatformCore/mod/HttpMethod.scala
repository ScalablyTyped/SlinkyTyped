package typingsSlinky.zapierPlatformCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// internal only
// export const integrationTestHandler: () => any;
// export const createAppHandler: (appRaw: object) => any
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.GET
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.POST
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.PUT
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.PATCH
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.DELETE
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS
  - typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.HEAD
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.zapierPlatformCore.zapierPlatformCoreStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

