package com.company.jmixtest.entity.testone;

import io.jmix.ui.screen.*;
import com.company.jmixtest.entity.TestOne;

@UiController("Test1.browse")
@UiDescriptor("test-one-browse.xml")
@LookupComponent("testOnesTable")
public class TestOneBrowse extends StandardLookup<TestOne> {
}
