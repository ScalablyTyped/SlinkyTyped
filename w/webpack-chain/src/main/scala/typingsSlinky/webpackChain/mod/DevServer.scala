package typingsSlinky.webpackChain.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.webpackChain.anon.Errors
import typingsSlinky.webpackChain.webpackChainStrings.error
import typingsSlinky.webpackChain.webpackChainStrings.info
import typingsSlinky.webpackChain.webpackChainStrings.none
import typingsSlinky.webpackChain.webpackChainStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-chain", "DevServer")
@js.native
class DevServer ()
  extends typingsSlinky.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  
  def apply(value: String): this.type = js.native
  
  def after(
    value: js.Function3[
      /* app */ js.Any, 
      /* server */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  
  var allowedHosts: TypedChainedSet[this.type, String] = js.native
  
  def before(
    value: js.Function3[
      /* app */ js.Any, 
      /* server */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  
  def bonjour(value: Boolean): this.type = js.native
  
  @JSName("clientLogLevel")
  def clientLogLevel_error(value: error): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_info(value: info): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_none(value: none): this.type = js.native
  @JSName("clientLogLevel")
  def clientLogLevel_warning(value: warning): this.type = js.native
  
  def color(value: Boolean): this.type = js.native
  
  def compress(value: Boolean): this.type = js.native
  
  def contentBase(value: String): this.type = js.native
  def contentBase(value: js.Array[String]): this.type = js.native
  def contentBase(value: Boolean): this.type = js.native
  
  def disableHostCheck(value: Boolean): this.type = js.native
  
  def filename(value: String): this.type = js.native
  
  def headers(value: StringDictionary[String]): this.type = js.native
  
  def historyApiFallback(value: js.Any): this.type = js.native
  def historyApiFallback(value: Boolean): this.type = js.native
  
  def host(value: String): this.type = js.native
  
  def hot(value: Boolean): this.type = js.native
  
  def hotOnly(value: Boolean): this.type = js.native
  
  def http2(value: Boolean): this.type = js.native
  
  def https(value: Boolean): this.type = js.native
  def https(value: ServerOptions): this.type = js.native
  
  def index(value: String): this.type = js.native
  
  def info(value: Boolean): this.type = js.native
  
  def `inline`(value: Boolean): this.type = js.native
  
  def `lazy`(value: Boolean): this.type = js.native
  
  def mimeTypes(value: js.Object): this.type = js.native
  
  def noInfo(value: Boolean): this.type = js.native
  
  def open(value: Boolean): this.type = js.native
  
  def openPage(value: String): this.type = js.native
  def openPage(value: js.Array[String]): this.type = js.native
  
  def overlay(value: Boolean): this.type = js.native
  def overlay(value: Errors): this.type = js.native
  
  def pfx(value: String): this.type = js.native
  
  def pfxPassphrase(value: String): this.type = js.native
  
  def port(value: Double): this.type = js.native
  
  def progress(value: Boolean): this.type = js.native
  
  def proxy(value: js.Any): this.type = js.native
  
  def publicPath(publicPath: String): this.type = js.native
  
  def quiet(value: Boolean): this.type = js.native
  
  def setup(value: js.Function1[/* expressApp */ js.Any, Unit]): this.type = js.native
  
  def sockHost(value: String): this.type = js.native
  
  def sockPath(value: String): this.type = js.native
  
  def sockPort(value: Double): this.type = js.native
  
  def socket(value: String): this.type = js.native
  
  def staticOptions(value: js.Any): this.type = js.native
  
  def stats(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
  ): this.type = js.native
  
  def stdin(value: Boolean): this.type = js.native
  
  def useLocalIp(value: Boolean): this.type = js.native
  
  def watchContentBase(value: Boolean): this.type = js.native
  
  def watchOptions(value: js.Any): this.type = js.native
  
  def writeToDisk(value: Boolean): this.type = js.native
}
