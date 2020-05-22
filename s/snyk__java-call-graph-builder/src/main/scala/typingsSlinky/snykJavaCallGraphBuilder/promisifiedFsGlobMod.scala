package typingsSlinky.snykJavaCallGraphBuilder

import typingsSlinky.glob.mod.IOptions
import typingsSlinky.node.Buffer
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.EncodingNull
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/promisified-fs-glob", JSImport.Namespace)
@js.native
object promisifiedFsGlobMod extends js.Object {
  val exists: js.Function1[/* path */ PathLike, js.Promise[Boolean]] = js.native
  val rename: js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, js.Promise[Unit]] = js.native
  val unlink: js.Function1[/* path */ PathLike, js.Promise[Unit]] = js.native
  @js.native
  object glob extends js.Object {
    def apply(pattern: String): js.Promise[js.Array[String]] = js.native
    def apply(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  object mkdir extends js.Object {
    def apply(path: PathLike): js.Promise[js.UndefOr[String]] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
    def apply(path: PathLike, options: Mode): js.Promise[js.UndefOr[String]] = js.native
  }
  
  @js.native
  object readFile extends js.Object {
    def apply(path: Double): js.Promise[String | Buffer] = js.native
    def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
    def apply(path: Double, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def apply(path: Double, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def apply(path: Double, options: EncodingNull): js.Promise[Buffer] = js.native
    def apply(path: PathLike): js.Promise[String | Buffer] = js.native
    def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def apply(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def apply(path: PathLike, options: EncodingNull): js.Promise[Buffer] = js.native
  }
  
}

