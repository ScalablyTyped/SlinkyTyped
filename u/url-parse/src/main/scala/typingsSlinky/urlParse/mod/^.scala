package typingsSlinky.urlParse.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.urlParse.anon.Parse
import typingsSlinky.urlParse.anon.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("url-parse", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* address */ String, URLParse]) with (Instantiable2[/* address */ String, /* location */ String, URLParse]) with (Instantiable2[/* address */ String, /* location */ js.Object, URLParse]) with (Instantiable2[/* address */ String, /* parser */ Boolean, URLParse]) with (Instantiable2[/* address */ String, /* parser */ QueryParser, URLParse]) with (Instantiable3[/* address */ String, /* location */ String, /* parser */ Boolean, URLParse]) with (Instantiable3[/* address */ String, /* location */ String, /* parser */ QueryParser, URLParse]) with (Instantiable3[/* address */ String, /* location */ js.Object, /* parser */ Boolean, URLParse]) with (Instantiable3[/* address */ String, /* location */ js.Object, /* parser */ QueryParser, URLParse]) with (Instantiable3[
        /* address */ String, 
        /* location */ js.UndefOr[scala.Nothing], 
        /* parser */ Boolean, 
        URLParse
      ]) with (Instantiable3[
        /* address */ String, 
        /* location */ js.UndefOr[scala.Nothing], 
        /* parser */ QueryParser, 
        URLParse
      ])
    ] {
  
  def apply(address: String): URLParse = js.native
  def apply(address: String, location: js.UndefOr[scala.Nothing], parser: Boolean): URLParse = js.native
  def apply(address: String, location: js.UndefOr[scala.Nothing], parser: QueryParser): URLParse = js.native
  def apply(address: String, location: String): URLParse = js.native
  def apply(address: String, location: String, parser: Boolean): URLParse = js.native
  def apply(address: String, location: String, parser: QueryParser): URLParse = js.native
  def apply(address: String, location: js.Object): URLParse = js.native
  def apply(address: String, location: js.Object, parser: Boolean): URLParse = js.native
  def apply(address: String, location: js.Object, parser: QueryParser): URLParse = js.native
  def apply(address: String, parser: Boolean): URLParse = js.native
  def apply(address: String, parser: QueryParser): URLParse = js.native
  
  def extractProtocol(url: String): Protocol = js.native
  
  def location(url: String): js.Object = js.native
  
  var qs: Parse = js.native
}
