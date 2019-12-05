package typingsSlinky.ssh2.ssh2Mod

import typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2", "SFTP_OPEN_MODE")
@js.native
object SFTP_OPEN_MODE extends js.Object {
  /* 0x00000004 */ val APPEND: typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE.APPEND with Double = js.native
  /* 0x00000008 */ val CREAT: typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE.CREAT with Double = js.native
  /* 0x00000020 */ val EXCL: typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE.EXCL with Double = js.native
  /* 0x00000001 */ val READ: typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE.READ with Double = js.native
  /* 0x00000010 */ val TRUNC: typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE.TRUNC with Double = js.native
  /* 0x00000002 */ val WRITE: typingsSlinky.ssh2DashStreams.ssh2DashStreamsMod.SFTPStream.OPEN_MODE.WRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OPEN_MODE with Double] = js.native
}

