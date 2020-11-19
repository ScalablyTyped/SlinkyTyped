package typingsSlinky.tap.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tap.mod.Options.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tap", "Assertions")
@js.native
object Assertions extends js.Object {
  
  @js.native
  trait Throws extends js.Object {
    
    def apply(): Boolean = js.native
    def apply(
      fn: js.UndefOr[scala.Nothing],
      expectedError: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      extra: Assert
    ): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], expectedError: js.UndefOr[scala.Nothing], message: String): Boolean = js.native
    def apply(
      fn: js.UndefOr[scala.Nothing],
      expectedError: js.UndefOr[scala.Nothing],
      message: String,
      extra: Assert
    ): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], expectedError: js.Error): Boolean = js.native
    def apply(
      fn: js.UndefOr[scala.Nothing],
      expectedError: js.Error,
      message: js.UndefOr[scala.Nothing],
      extra: Assert
    ): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], expectedError: js.Error, message: String): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], expectedError: js.Error, message: String, extra: Assert): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], messageOrExpectedError: js.UndefOr[scala.Nothing], extra: Assert): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], messageOrExpectedError: String): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def apply(fn: js.UndefOr[scala.Nothing], messageOrExpectedError: js.Error, extra: Assert): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
    def apply(
      fn: js.Function1[/* repeated */ js.Any, _],
      expectedError: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      extra: Assert
    ): Boolean = js.native
    def apply(
      fn: js.Function1[/* repeated */ js.Any, _],
      expectedError: js.UndefOr[scala.Nothing],
      message: String
    ): Boolean = js.native
    def apply(
      fn: js.Function1[/* repeated */ js.Any, _],
      expectedError: js.UndefOr[scala.Nothing],
      message: String,
      extra: Assert
    ): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], expectedError: js.Error): Boolean = js.native
    def apply(
      fn: js.Function1[/* repeated */ js.Any, _],
      expectedError: js.Error,
      message: js.UndefOr[scala.Nothing],
      extra: Assert
    ): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], expectedError: js.Error, message: String): Boolean = js.native
    def apply(
      fn: js.Function1[/* repeated */ js.Any, _],
      expectedError: js.Error,
      message: String,
      extra: Assert
    ): Boolean = js.native
    def apply(
      fn: js.Function1[/* repeated */ js.Any, _],
      messageOrExpectedError: js.UndefOr[scala.Nothing],
      extra: Assert
    ): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], messageOrExpectedError: String): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], messageOrExpectedError: js.Error, extra: Assert): Boolean = js.native
  }
  
  type Basic = js.Function3[
    /* obj */ js.Any, 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  
  type DoesNotThrow = js.Function3[
    /* fn */ js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]], 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  
  type Equal = js.Function4[
    /* found */ js.Any, 
    /* wanted */ js.Any, 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  
  type Match = js.Function4[
    /* found */ js.Any, 
    /* pattern */ String | js.RegExp | StringDictionary[js.RegExp], 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  
  type NotEqual = js.Function4[
    /* found */ js.Any, 
    /* notWanted */ js.Any, 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  
  type Type = js.Function4[
    /* found */ js.Any, 
    /* type */ String | (Instantiable1[/* args (repeated) */ js.Any, js.Object]), 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
}
