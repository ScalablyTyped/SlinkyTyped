package typingsSlinky.ssh2.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.ssh2.ssh2Strings.`auth-agent`
import typingsSlinky.ssh2.ssh2Strings.`window-change`
import typingsSlinky.ssh2.ssh2Strings.close
import typingsSlinky.ssh2.ssh2Strings.env
import typingsSlinky.ssh2.ssh2Strings.exec
import typingsSlinky.ssh2.ssh2Strings.pty
import typingsSlinky.ssh2.ssh2Strings.sftp
import typingsSlinky.ssh2.ssh2Strings.shell
import typingsSlinky.ssh2.ssh2Strings.signal
import typingsSlinky.ssh2.ssh2Strings.subsystem
import typingsSlinky.ssh2.ssh2Strings.x11
import typingsSlinky.ssh2Streams.mod.SFTPStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends EventEmitter {
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the client has requested incoming ssh-agent requests be forwarded to them.
    */
  @JSName("on")
  def on_authagent(
    event: `auth-agent`,
    listener: js.Function2[/* accept */ SessionAcceptReject, /* reject */ SessionAcceptReject, Unit]
  ): this.type = js.native
  /**
    * Emitted when the session has closed.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the client requested an environment variable to be set for this session.
    */
  @JSName("on")
  def on_env(
    event: env,
    listener: js.Function3[
      /* accept */ SessionAcceptReject, 
      /* reject */ SessionAcceptReject, 
      /* info */ SetEnvInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested execution of a command string.
    */
  @JSName("on")
  def on_exec(
    event: exec,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ SessionAcceptReject, 
      /* info */ ExecInfo, 
      Unit
    ]
  ): this.type = js.native
  // Session events
  /**
    * Emitted when the client requested allocation of a pseudo-TTY for this session.
    */
  @JSName("on")
  def on_pty(
    event: pty,
    listener: js.Function3[
      /* accept */ SessionAcceptReject, 
      /* reject */ SessionAcceptReject, 
      /* info */ PseudoTtyInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested the SFTP subsystem.
    */
  @JSName("on")
  def on_sftp(
    event: sftp,
    listener: js.Function2[/* accept */ js.Function0[SFTPStream], /* reject */ SessionAcceptReject, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an interactive shell.
    */
  @JSName("on")
  def on_shell(
    event: shell,
    listener: js.Function2[/* accept */ js.Function0[ServerChannel], /* reject */ SessionAcceptReject, Unit]
  ): this.type = js.native
  /**
    * Emitted when the client has sent a POSIX signal.
    */
  @JSName("on")
  def on_signal(
    event: signal,
    listener: js.Function3[
      /* accept */ SessionAcceptReject, 
      /* reject */ SessionAcceptReject, 
      /* info */ SignalInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client has requested an arbitrary subsystem.
    */
  @JSName("on")
  def on_subsystem(
    event: subsystem,
    listener: js.Function3[
      /* accept */ js.Function0[ServerChannel], 
      /* reject */ SessionAcceptReject, 
      /* info */ SubsystemInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client reported a change in window dimensions during this session.
    */
  @JSName("on")
  def on_windowchange(
    event: `window-change`,
    listener: js.Function3[
      /* accept */ SessionAcceptReject, 
      /* reject */ SessionAcceptReject, 
      /* info */ WindowChangeInfo, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the client requested X11 forwarding.
    */
  @JSName("on")
  def on_x11(
    event: x11,
    listener: js.Function3[
      /* accept */ SessionAcceptReject, 
      /* reject */ SessionAcceptReject, 
      /* info */ X11Info, 
      Unit
    ]
  ): this.type = js.native
}
