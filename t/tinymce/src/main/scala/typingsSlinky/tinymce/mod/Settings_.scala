package typingsSlinky.tinymce.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.tinymce.mod.settings.Menu
import typingsSlinky.tinymce.tinymceBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings_ extends js.Object {
  var advlist_number_styles: js.UndefOr[String] = js.native
  var allow_conditional_comments: js.UndefOr[Boolean] = js.native
  var allow_html_in_named_anchor: js.UndefOr[Boolean] = js.native
  var allow_script_urls: js.UndefOr[Boolean] = js.native
  var allow_unsafe_link_target: js.UndefOr[Boolean] = js.native
  var anchor_bottom: js.UndefOr[String] = js.native
  var anchor_top: js.UndefOr[String] = js.native
  var auto_focus: js.UndefOr[String] = js.native
  var automatic_uploads: js.UndefOr[Boolean] = js.native
  var autosave_ask_before_unload: js.UndefOr[Boolean] = js.native
  var autosave_interval: js.UndefOr[String] = js.native
  var autosave_prefix: js.UndefOr[String] = js.native
  var autosave_restore_when_empty: js.UndefOr[Boolean] = js.native
  var autosave_retention: js.UndefOr[String] = js.native
  var base_url: js.UndefOr[String] = js.native
  var block_formats: js.UndefOr[String] = js.native
  var body_class: js.UndefOr[String] = js.native
  var body_id: js.UndefOr[String] = js.native
  var br_in_pre: js.UndefOr[Boolean] = js.native
  var branding: js.UndefOr[Boolean] = js.native
  var browser_spellcheck: js.UndefOr[Boolean] = js.native
  var cache_suffix: js.UndefOr[String] = js.native
  var color_picker_callback: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String, Unit]
  ] = js.native
  var content_css: js.UndefOr[String | js.Array[String]] = js.native
  var content_security_policy: js.UndefOr[String] = js.native
  var content_style: js.UndefOr[String] = js.native
  var convert_fonts_to_spans: js.UndefOr[Boolean] = js.native
  var convert_urls: js.UndefOr[Boolean] = js.native
  var custom_elements: js.UndefOr[String] = js.native
  var custom_ui_selector: js.UndefOr[String] = js.native
  var custom_undo_redo_levels: js.UndefOr[Double] = js.native
  var directionality: js.UndefOr[String] = js.native
  var doctype: js.UndefOr[String] = js.native
  var document_base_url: js.UndefOr[String] = js.native
  var element_format: js.UndefOr[String] = js.native
  var elementpath: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var end_container_on_empty_block: js.UndefOr[Boolean] = js.native
  var entities: js.UndefOr[String] = js.native
  var entity_encoding: js.UndefOr[String] = js.native
  var event_root: js.UndefOr[Boolean] = js.native
  var extended_valid_elements: js.UndefOr[String] = js.native
  var external_plugins: js.UndefOr[js.Object] = js.native
  var file_browser_callback: js.UndefOr[
    js.Function4[/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window, Unit]
  ] = js.native
  var file_browser_callback_types: js.UndefOr[String] = js.native
  var file_picker_callback: js.UndefOr[
    js.Function3[
      /* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], 
      /* valud */ String, 
      /* meta */ js.Object, 
      Unit
    ]
  ] = js.native
  var file_picker_types: js.UndefOr[String] = js.native
  var fix_list_elements: js.UndefOr[Boolean] = js.native
  var fixed_toolbar_container: js.UndefOr[String] = js.native
  var font_formats: js.UndefOr[String] = js.native
  var fontsize_formats: js.UndefOr[String] = js.native
  var force_hex_style_colors: js.UndefOr[Boolean] = js.native
  var forced_root_block: js.UndefOr[String] = js.native
  var forced_root_block_attrs: js.UndefOr[js.Object] = js.native
  var formats: js.UndefOr[js.Object] = js.native
  var gecko_spellcheck: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden_input: js.UndefOr[Boolean] = js.native
  var images_dataimg_filter: js.UndefOr[js.Function1[/* img */ js.Any, Unit]] = js.native
  var images_reuse_filename: js.UndefOr[Boolean] = js.native
  var images_upload_base_path: js.UndefOr[String] = js.native
  var images_upload_credentials: js.UndefOr[Boolean] = js.native
  var images_upload_handler: js.UndefOr[
    js.Function3[
      /* blobInfo */ js.Any, 
      /* success */ js.Function1[/* msg */ String, Unit], 
      /* failure */ js.Function1[/* msg */ String, Unit], 
      Unit
    ]
  ] = js.native
  var images_upload_url: js.UndefOr[String] = js.native
  var imagetools_api_key: js.UndefOr[String] = js.native
  var imagetools_cors_hosts: js.UndefOr[js.Array[String]] = js.native
  var imagetools_proxy: js.UndefOr[String] = js.native
  var imagetools_toolbar: js.UndefOr[String] = js.native
  var indentation: js.UndefOr[String] = js.native
  var init_instance_callback: js.UndefOr[js.Function1[/* editor */ Editor, Unit]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inline_boundaries: js.UndefOr[Boolean] = js.native
  var insert_button_items: js.UndefOr[String] = js.native
  var insert_toolbar: js.UndefOr[String] = js.native
  var invalid_elements: js.UndefOr[String] = js.native
  var invalid_styles: js.UndefOr[String | js.Object] = js.native
  var keep_styles: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var language_url: js.UndefOr[String] = js.native
  var max_height: js.UndefOr[Double] = js.native
  var max_width: js.UndefOr[Double] = js.native
  var menu: js.UndefOr[Menu] = js.native
  var menubar: js.UndefOr[String | Boolean] = js.native
  var min_height: js.UndefOr[Double | String] = js.native
  var min_width: js.UndefOr[Double | String] = js.native
  var nowrap: js.UndefOr[Boolean] = js.native
  var object_resizing: js.UndefOr[Boolean | String] = js.native
  var paste_data_images: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[String | js.Array[String]] = js.native
  var preview_styles: js.UndefOr[Boolean | String] = js.native
  var protect: js.UndefOr[js.Array[js.RegExp]] = js.native
  var relative_urls: js.UndefOr[Boolean] = js.native
  var removeFormat: js.UndefOr[js.Array[js.Object]] = js.native
  var remove_script_host: js.UndefOr[Boolean] = js.native
  var remove_trailing_brs: js.UndefOr[Boolean] = js.native
  var removed_menuitems: js.UndefOr[String] = js.native
  var resize: js.UndefOr[Boolean | String] = js.native
  var schema: js.UndefOr[String] = js.native
  var selection_toolbar: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
  var setup: js.UndefOr[js.Function1[/* edtor */ Editor, Unit]] = js.native
  var skin: js.UndefOr[`false` | String] = js.native
  var skin_url: js.UndefOr[String] = js.native
  var spellchecker_active: js.UndefOr[Boolean] = js.native
  var spellchecker_dialog: js.UndefOr[Boolean] = js.native
  var spellchecker_language: js.UndefOr[String] = js.native
  var spellchecker_languages: js.UndefOr[String] = js.native
  var spellchecker_on_load: js.UndefOr[Boolean] = js.native
  var spellchecker_rpc_url: js.UndefOr[String] = js.native
  var spellchecker_whitelist: js.UndefOr[js.Array[String]] = js.native
  var statusbar: js.UndefOr[Boolean] = js.native
  var style_formats: js.UndefOr[js.Array[js.Object]] = js.native
  var style_formats_autohide: js.UndefOr[Boolean] = js.native
  var style_formats_merge: js.UndefOr[Boolean] = js.native
  var table_advtab: js.UndefOr[Boolean] = js.native
  var table_appearance_options: js.UndefOr[Boolean] = js.native
  var table_cell_advtab: js.UndefOr[Boolean] = js.native
  var table_cell_class_list: js.UndefOr[js.Array[js.Object]] = js.native
  var table_class_list: js.UndefOr[js.Array[js.Object]] = js.native
  var table_clone_elements: js.UndefOr[String] = js.native
  var table_default_attributes: js.UndefOr[js.Object | String] = js.native
  var table_default_styles: js.UndefOr[js.Object | String] = js.native
  var table_grid: js.UndefOr[Boolean] = js.native
  var table_row_advtab: js.UndefOr[Boolean] = js.native
  var table_row_class_list: js.UndefOr[js.Array[js.Object]] = js.native
  var table_tab_navigation: js.UndefOr[Boolean] = js.native
  var table_toolbar: js.UndefOr[String] = js.native
  var target: js.UndefOr[Element] = js.native
  var theme: js.UndefOr[String] = js.native
  var theme_url: js.UndefOr[String] = js.native
  var toolbar: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  var type_ahead_urls: js.UndefOr[Boolean] = js.native
  var urlconverter_callback: js.UndefOr[
    js.Function4[/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String, Unit]
  ] = js.native
  var valid_children: js.UndefOr[String] = js.native
  var valid_classes: js.UndefOr[String | js.Object] = js.native
  var valid_elements: js.UndefOr[String] = js.native
  var valid_styles: js.UndefOr[js.Object] = js.native
  var visual: js.UndefOr[Boolean] = js.native
  var visual_anchor_class: js.UndefOr[String] = js.native
  var visual_table_class: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object Settings_ {
  @scala.inline
  def apply(): Settings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings_]
  }
  @scala.inline
  implicit class Settings_Ops[Self <: Settings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvlist_number_styles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advlist_number_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvlist_number_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advlist_number_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_conditional_comments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_conditional_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_conditional_comments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_conditional_comments")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_html_in_named_anchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_html_in_named_anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_html_in_named_anchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_html_in_named_anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_script_urls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_script_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_script_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_script_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_unsafe_link_target(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unsafe_link_target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_unsafe_link_target: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unsafe_link_target")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchor_bottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor_bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor_bottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor_bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchor_top(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor_top")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto_focus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_focus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_focus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomatic_uploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic_uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatic_uploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic_uploads")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave_ask_before_unload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_ask_before_unload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave_ask_before_unload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_ask_before_unload")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave_interval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave_restore_when_empty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_restore_when_empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave_restore_when_empty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_restore_when_empty")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave_retention(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_retention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave_retention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave_retention")(js.undefined)
        ret
    }
    @scala.inline
    def withBase_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_url")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock_formats(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block_formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock_formats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block_formats")(js.undefined)
        ret
    }
    @scala.inline
    def withBody_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_class")(js.undefined)
        ret
    }
    @scala.inline
    def withBody_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_id")(js.undefined)
        ret
    }
    @scala.inline
    def withBr_in_pre(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br_in_pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr_in_pre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br_in_pre")(js.undefined)
        ret
    }
    @scala.inline
    def withBranding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branding")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowser_spellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_spellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withCache_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withColor_picker_callback(value: (/* callback */ js.Function1[/* hexColor */ String, Unit], /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_picker_callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColor_picker_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color_picker_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_css(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_css: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_css")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_security_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_security_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_style(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_style")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert_fonts_to_spans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert_fonts_to_spans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert_fonts_to_spans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert_fonts_to_spans")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert_urls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_elements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_ui_selector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_ui_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_ui_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_ui_selector")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_undo_redo_levels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_undo_redo_levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_undo_redo_levels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_undo_redo_levels")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionality")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_base_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_base_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_base_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_base_url")(js.undefined)
        ret
    }
    @scala.inline
    def withElement_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_format")(js.undefined)
        ret
    }
    @scala.inline
    def withElementpath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementpath")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_container_on_empty_block(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_container_on_empty_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_container_on_empty_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_container_on_empty_block")(js.undefined)
        ret
    }
    @scala.inline
    def withEntities(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity_encoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity_encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity_encoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity_encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_root(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_root: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_root")(js.undefined)
        ret
    }
    @scala.inline
    def withExtended_valid_elements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended_valid_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtended_valid_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended_valid_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_plugins(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_plugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_browser_callback(value: (/* field_name */ String, /* url */ String, /* type */ String, /* win */ Window) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_browser_callback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFile_browser_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_browser_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_browser_callback_types(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_browser_callback_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_browser_callback_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_browser_callback_types")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_picker_callback(
      value: (/* callback */ js.Function2[/* filename */ String, /* metadata */ js.Object, Unit], /* valud */ String, /* meta */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_picker_callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFile_picker_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_picker_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_picker_types(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_picker_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_picker_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_picker_types")(js.undefined)
        ret
    }
    @scala.inline
    def withFix_list_elements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix_list_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFix_list_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fix_list_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed_toolbar_container(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_toolbar_container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed_toolbar_container: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_toolbar_container")(js.undefined)
        ret
    }
    @scala.inline
    def withFont_formats(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont_formats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_formats")(js.undefined)
        ret
    }
    @scala.inline
    def withFontsize_formats(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsize_formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontsize_formats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsize_formats")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_hex_style_colors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_hex_style_colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_hex_style_colors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_hex_style_colors")(js.undefined)
        ret
    }
    @scala.inline
    def withForced_root_block(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced_root_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForced_root_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced_root_block")(js.undefined)
        ret
    }
    @scala.inline
    def withForced_root_block_attrs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced_root_block_attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForced_root_block_attrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced_root_block_attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withGecko_spellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecko_spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGecko_spellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecko_spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden_input(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden_input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden_input: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden_input")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_dataimg_filter(value: /* img */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_dataimg_filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutImages_dataimg_filter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_dataimg_filter")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_reuse_filename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_reuse_filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_reuse_filename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_reuse_filename")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_upload_base_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_base_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_upload_base_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_base_path")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_upload_credentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_upload_credentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_upload_handler(
      value: (/* blobInfo */ js.Any, /* success */ js.Function1[/* msg */ String, Unit], /* failure */ js.Function1[/* msg */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutImages_upload_handler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_handler")(js.undefined)
        ret
    }
    @scala.inline
    def withImages_upload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages_upload_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images_upload_url")(js.undefined)
        ret
    }
    @scala.inline
    def withImagetools_api_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_api_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagetools_api_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_api_key")(js.undefined)
        ret
    }
    @scala.inline
    def withImagetools_cors_hosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_cors_hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagetools_cors_hosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_cors_hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withImagetools_proxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagetools_proxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withImagetools_toolbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagetools_toolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagetools_toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(js.undefined)
        ret
    }
    @scala.inline
    def withInit_instance_callback(value: /* editor */ Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init_instance_callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit_instance_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init_instance_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_boundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_boundaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_boundaries")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert_button_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_button_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert_button_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_button_items")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert_toolbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert_toolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid_elements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid_styles(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_styles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_height")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_width")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMenubar(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menubar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenubar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menubar")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_height(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_height")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_width(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_width")(js.undefined)
        ret
    }
    @scala.inline
    def withNowrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowrap")(js.undefined)
        ret
    }
    @scala.inline
    def withObject_resizing(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_resizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject_resizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_resizing")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste_data_images(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste_data_images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaste_data_images: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste_data_images")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview_styles(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withProtect(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protect")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative_urls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFormat(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove_script_host(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_script_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_script_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_script_host")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove_trailing_brs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_trailing_brs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_trailing_brs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_trailing_brs")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved_menuitems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed_menuitems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved_menuitems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed_menuitems")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection_toolbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection_toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection_toolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection_toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: /* edtor */ Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_active(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_active: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_active")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_dialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_dialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_dialog")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_language")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_languages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_languages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_languages")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_on_load(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_on_load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_on_load: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_on_load")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_rpc_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_rpc_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_rpc_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_rpc_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellchecker_whitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellchecker_whitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellchecker_whitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusbar")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle_formats(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle_formats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_formats")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle_formats_autohide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_formats_autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle_formats_autohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_formats_autohide")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle_formats_merge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_formats_merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle_formats_merge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style_formats_merge")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_advtab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_advtab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_advtab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_advtab")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_appearance_options(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_appearance_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_appearance_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_appearance_options")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_cell_advtab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_cell_advtab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_cell_advtab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_cell_advtab")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_cell_class_list(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_cell_class_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_cell_class_list: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_cell_class_list")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_class_list(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_class_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_class_list: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_class_list")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_clone_elements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_clone_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_clone_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_clone_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_default_attributes(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_default_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_default_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_default_attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_default_styles(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_default_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_default_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_default_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_grid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_grid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_grid")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_row_advtab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_row_advtab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_row_advtab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_row_advtab")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_row_class_list(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_row_class_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_row_class_list: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_row_class_list")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_tab_navigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_tab_navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_tab_navigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_tab_navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withTable_toolbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable_toolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme_url")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Boolean | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withType_ahead_urls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_ahead_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType_ahead_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_ahead_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlconverter_callback(
      value: (/* url */ String, /* node */ HTMLElement, /* on_save */ Boolean, /* name */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlconverter_callback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUrlconverter_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlconverter_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withValid_children(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid_children: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_children")(js.undefined)
        ret
    }
    @scala.inline
    def withValid_classes(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid_classes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_classes")(js.undefined)
        ret
    }
    @scala.inline
    def withValid_elements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withValid_styles(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid_styles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_styles")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual_anchor_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_anchor_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual_anchor_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_anchor_class")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual_table_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_table_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual_table_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_table_class")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

