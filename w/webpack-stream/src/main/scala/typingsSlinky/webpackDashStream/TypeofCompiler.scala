package typingsSlinky.webpackDashStream

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.webpack.webpackMod.Compiler
import typingsSlinky.webpack.webpackMod.Compiler.Watching
import typingsSlinky.webpack.webpackMod.Compiler.Watching.Handler
import typingsSlinky.webpack.webpackMod.Compiler.Watching.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCompiler extends js.Object {
  var Watching: Instantiable3[
    /* compiler */ Compiler, 
    /* watchOptions */ WatchOptions, 
    /* handler */ Handler, 
    typingsSlinky.webpack.webpackMod.Compiler.Watching
  ]
}

object TypeofCompiler {
  @scala.inline
  def apply(
    Watching: Instantiable3[
      /* compiler */ Compiler, 
      /* watchOptions */ WatchOptions, 
      /* handler */ Handler, 
      Watching
    ]
  ): TypeofCompiler = {
    val __obj = js.Dynamic.literal(Watching = Watching.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofCompiler]
  }
}

