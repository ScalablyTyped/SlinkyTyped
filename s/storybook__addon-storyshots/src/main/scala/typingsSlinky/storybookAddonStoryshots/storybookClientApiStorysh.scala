package typingsSlinky.storybookAddonStoryshots

import typingsSlinky.glob.mod.IOptions
import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsSlinky.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import typingsSlinky.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typingsSlinky.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  storybook  :@storybook/addon-storyshots.@storybook/addon-storyshots/dist/frameworks/Loader.ClientApi} & @storybook/addon-storyshots.@storybook/addon-storyshots/dist/api/StoryshotsOptions.StoryshotsOptions */
@js.native
trait storybookClientApiStorysh extends js.Object {
  var asyncJest: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.native
  var configPath: js.UndefOr[String] = js.native
  var framework: js.UndefOr[SupportedFramework] = js.native
  var integrityOptions: js.UndefOr[IOptions | `false`] = js.native
  var renderer: js.UndefOr[js.Function] = js.native
  /**
    * @Deprecated The functionality of this option is completely covered by snapshotSerializers which should be used instead.
    */
  var serializer: js.UndefOr[js.Any] = js.native
  var snapshotSerializers: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
    ]
  ] = js.native
  var stories2snapsConverter: js.UndefOr[Stories2SnapsConverter] = js.native
  var storyKindRegex: js.UndefOr[js.RegExp | String] = js.native
  var storyNameRegex: js.UndefOr[js.RegExp | String] = js.native
  var storybook: ClientApi = js.native
  var suite: js.UndefOr[String] = js.native
  var test: js.UndefOr[
    js.Function4[
      /* story */ js.Any, 
      /* context */ js.Any, 
      /* renderTree */ RenderTree, 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
}

object storybookClientApiStorysh {
  @scala.inline
  def apply(storybook: ClientApi): storybookClientApiStorysh = {
    val __obj = js.Dynamic.literal(storybook = storybook.asInstanceOf[js.Any])
    __obj.asInstanceOf[storybookClientApiStorysh]
  }
  @scala.inline
  implicit class storybookClientApiStoryshOps[Self <: storybookClientApiStorysh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorybook(value: ClientApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storybook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncJest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncJest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncJest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncJest")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: /* options */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: SupportedFramework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrityOptions(value: IOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrityOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotSerializers(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotSerializers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotSerializers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotSerializers")(js.undefined)
        ret
    }
    @scala.inline
    def withStories2snapsConverter(value: Stories2SnapsConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories2snapsConverter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStories2snapsConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories2snapsConverter")(js.undefined)
        ret
    }
    @scala.inline
    def withStoryKindRegexRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyKindRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryKindRegex(value: js.RegExp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyKindRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoryKindRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyKindRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withStoryNameRegexRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyNameRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryNameRegex(value: js.RegExp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyNameRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoryNameRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyNameRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withSuite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(
      value: (/* story */ js.Any, /* context */ js.Any, /* renderTree */ RenderTree, /* options */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
  }
  
}

