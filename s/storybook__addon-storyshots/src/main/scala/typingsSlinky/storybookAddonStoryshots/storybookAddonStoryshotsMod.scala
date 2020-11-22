package typingsSlinky.storybookAddonStoryshots

import typingsSlinky.storybookAddonStoryshots.anon.PartialStories2SnapsConve
import typingsSlinky.storybookAddonStoryshots.anon.Renderer
import typingsSlinky.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions
import typingsSlinky.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsTestMethod
import typingsSlinky.storybookAddonStoryshots.testBodiesMod.SnapshotsWithOptionsReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-storyshots", JSImport.Namespace)
@js.native
object storybookAddonStoryshotsMod extends js.Object {
  
  def default(): Unit = js.native
  def default(options: StoryshotsOptions): Unit = js.native
  
  def multiSnapshotWithOptions(): StoryshotsTestMethod = js.native
  def multiSnapshotWithOptions(options: js.Object): StoryshotsTestMethod = js.native
  
  val renderOnly: StoryshotsTestMethod = js.native
  
  def renderWithOptions(): StoryshotsTestMethod = js.native
  def renderWithOptions(options: js.Object): StoryshotsTestMethod = js.native
  
  val shallowSnapshot: StoryshotsTestMethod = js.native
  
  val snapshot: SnapshotsWithOptionsReturnType = js.native
  
  def snapshotWithOptions(): SnapshotsWithOptionsReturnType = js.native
  def snapshotWithOptions(options: js.Function): SnapshotsWithOptionsReturnType = js.native
  def snapshotWithOptions(options: Renderer): SnapshotsWithOptionsReturnType = js.native
  
  @js.native
  class Stories2SnapsConverter ()
    extends typingsSlinky.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter {
    def this(options: PartialStories2SnapsConve) = this()
  }
}
