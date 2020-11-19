package typingsSlinky.slateIrc.mod

import typingsSlinky.slateIrc.anon.Mode
import typingsSlinky.slateIrc.slateIrcStrings.away
import typingsSlinky.slateIrc.slateIrcStrings.data
import typingsSlinky.slateIrc.slateIrcStrings.join
import typingsSlinky.slateIrc.slateIrcStrings.message
import typingsSlinky.slateIrc.slateIrcStrings.mode
import typingsSlinky.slateIrc.slateIrcStrings.motd
import typingsSlinky.slateIrc.slateIrcStrings.nick
import typingsSlinky.slateIrc.slateIrcStrings.notice
import typingsSlinky.slateIrc.slateIrcStrings.part
import typingsSlinky.slateIrc.slateIrcStrings.quit
import typingsSlinky.slateIrc.slateIrcStrings.topic
import typingsSlinky.slateIrc.slateIrcStrings.welcome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slate-irc", "Client")
@js.native
class Client () extends js.Object {
  
  def action(target: String, msg: String): Unit = js.native
  
  def away(message: String): Unit = js.native
  
  def ctcp(target: String, msg: String): Unit = js.native
  
  def invite(name: String, channel: String): Unit = js.native
  
  def join(channel: String): Unit = js.native
  def join(channel: String, key: String): Unit = js.native
  
  def kick(channels: String, nicks: String, msg: String): Unit = js.native
  def kick(channels: String, nicks: js.Array[String], msg: String): Unit = js.native
  def kick(channels: js.Array[String], nicks: String, msg: String): Unit = js.native
  def kick(channels: js.Array[String], nicks: js.Array[String], msg: String): Unit = js.native
  
  var me: String = js.native
  
  def mode(target: String, flags: String, params: String): Unit = js.native
  
  def names(channel: String, callback: js.Function2[/* error */ js.Error, /* names */ js.Array[Mode], Unit]): Unit = js.native
  
  def nick(nick: String): Unit = js.native
  
  def notice(target: String, msg: String): Unit = js.native
  
  def on(event: String, callback: js.Function): Unit = js.native
  @JSName("on")
  def on_away(event: away, callback: js.Function1[/* event */ AwayEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_data(event: data, callback: js.Function1[/* event */ DataEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_join(event: join, callback: js.Function1[/* event */ JoinEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_message(event: message, callback: js.Function1[/* event */ MessageEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_mode(event: mode, callback: js.Function1[/* event */ ModeEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_motd(event: motd, callback: js.Function1[/* event */ MOTDEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_nick(event: nick, callback: js.Function1[/* event */ NickEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_notice(event: notice, callback: js.Function1[/* event */ MessageEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_part(event: part, callback: js.Function1[/* event */ PartEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_quit(event: quit, callback: js.Function1[/* event */ QuitEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_topic(event: topic, callback: js.Function1[/* event */ TopicEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_welcome(event: welcome, callback: js.Function1[/* name */ String, Unit]): Unit = js.native
  
  def oper(name: String, password: String): Unit = js.native
  
  def part(channel: String): Unit = js.native
  def part(channel: String, msg: String): Unit = js.native
  
  def pass(pass: String): Unit = js.native
  
  def quit(msg: String): Unit = js.native
  
  def send(target: String, msg: String): Unit = js.native
  
  def topic(channel: String, topic: String): Unit = js.native
  
  def user(username: String, realname: String): Unit = js.native
  
  def whois(target: String, mask: String, callback: js.Function): Unit = js.native
  
  def write(str: String): Unit = js.native
}
