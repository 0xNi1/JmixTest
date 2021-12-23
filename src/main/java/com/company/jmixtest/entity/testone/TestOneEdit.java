package com.company.jmixtest.entity.testone;

import io.jmix.ui.screen.*;
import com.company.jmixtest.entity.TestOne;

@UiController("Test1.edit")
@UiDescriptor("test-one-edit.xml")
@EditedEntityContainer("testOneDc")
public class TestOneEdit extends StandardEditor<TestOne> {
}
