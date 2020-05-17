package typingsSlinky.webdriver

import typingsSlinky.webdriver.WebDriver.AttachSessionOptions
import typingsSlinky.webdriver.WebDriver.Client
import typingsSlinky.webdriver.WebDriver.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object WebDriver extends js.Object {
    def attachToSession(options: AttachSessionOptions): js.Promise[Client] = js.native
    def attachToSession(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
    def attachToSession(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
    def attachToSession(
      options: AttachSessionOptions,
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.Object,
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def newSession(): js.Promise[Client] = js.native
    def newSession(options: Options): js.Promise[Client] = js.native
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, _],
      proto: js.Object,
      commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
    ): js.Promise[Client] = js.native
    def reloadSession(instance: Client): js.Promise[Client] = js.native
  }
  
}

